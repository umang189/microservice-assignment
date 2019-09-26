package com.example.Assignment.Umang;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CompanyController {

   // private Logger logger = LoggerFactory.getLogger(this.getClass());
   private static final Logger LOG = LogManager.getLogger(CompanyController.class);


    @Autowired
    CompanyRepository companyRepository;

    /*@GetMapping("/companyDetails2/cmmlevel/{level}/loaction/{location}")
    public ArrayList retrieveDetails2(@PathVariable int level, @PathVariable String location){

     ArrayList<Company> rawjson=   companyRepository.findByCMMLevelAndLocation(level,location);
        JsonArray response = new JsonArray();
        JsonObject jsonObject ;
        Gson gsonBuilder = new GsonBuilder().create();

  try {
      for (Company company : rawjson) {
          Data data = new Data(company.Initial, company.Repeatable, company.Defined,
                  company.Managed, company.Optimizing);
          jsonObject = new JsonObject();
          jsonObject.addProperty("CompanyName", company.CompanyName);
        //  jsonObject.addProperty("data", gsonBuilder.toJson(data));
          jsonObject.addProperty("data",data.toString());

          response.add(jsonObject);

      }

  }catch (Exception ex){
      throw ex;
  }

        return new Gson().fromJson(response,ArrayList.class);
    }
*/

    @PostMapping ("/companyDetails/cmmlevel/{level}/loaction/{location}")
    public ArrayList<Response> retrieveDetails(@PathVariable int level, @PathVariable String location){

        LOG.info("request id -> {}",System.currentTimeMillis());
        List<Company> rawjson= companyRepository.findByCMMLevelAndLocation(level,location);
        ArrayList<Response> finalResponse= new ArrayList<>();
        for (Company company:rawjson){
            Data data = new Data(company.Initial, company.Repeatable, company.Defined,
                    company.Managed, company.Optimizing);
            finalResponse.add(new Response(company.CompanyName,data));


        }
        return finalResponse;
      /*  JsonArray response = new JsonArray();
        JsonObject jsonObject ;
        Gson gsonBuilder = new GsonBuilder().create();

  try {
      for (Company company : rawjson) {
          Data data = new Data(company.Initial, company.Repeatable, company.Defined,
                  company.Managed, company.Optimizing);
          jsonObject = new JsonObject();
          jsonObject.addProperty("CompanyName", company.CompanyName);
          jsonObject.addProperty("data", gsonBuilder.toJson(data));
          response.add(jsonObject);

      }

  }catch (Exception ex){
      throw ex;
  }

        return response;*/
    }


   /* @PostMapping("/companyDetails")
    public List<Company> retrieveCompanyDetails(@RequestBody Company requestBody){

      //  logger.info("cmmlevel -> {} location -> {}",requestBody.CMMLevel, requestBody.location);

       return companyRepository.findByCMMLevelAndLocation(requestBody.CMMLevel,requestBody.location);
    }*/
}

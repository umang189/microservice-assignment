package com.example.Assignment.Umang;

public class Response {
    public Response(String companyName, Data data) {
        CompanyName = companyName;
        this.data = data;
    }

    public Response() {
    }

    public String getCompanyName() {
        return CompanyName;
    }

    public void setCompanyName(String companyName) {
        CompanyName = companyName;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    String CompanyName;
    Data data;

}

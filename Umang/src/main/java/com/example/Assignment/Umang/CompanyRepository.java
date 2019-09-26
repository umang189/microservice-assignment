package com.example.Assignment.Umang;

import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;
import java.util.List;

public interface CompanyRepository extends JpaRepository<Company,String> {




  ArrayList<Company> findByCMMLevelAndLocation(int CMMLevel, String location);
}

package com.example.Assignment.Umang;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Company {

    @Id
     @Column(name="COMPANYNAME")
    String CompanyName;
    int CMMLevel;
    String location;
    int Initial;
    int Repeatable;
    int Defined;
    int Managed;
    int Optimizing;

    public Company(String CompanyName, int CMMLevel, String location, int initial, int repeatable, int defined, int managed, int optimizing) {
        CompanyName = CompanyName;

        this.CMMLevel = CMMLevel;
        location = location;
        Initial = initial;
        Repeatable = repeatable;
        Defined = defined;
        Managed = managed;
        Optimizing = optimizing;
    }

    public String getCompanyName() {
        return CompanyName;
    }

    public void setCompanyName(String companyName) {
        CompanyName = companyName;
    }



    public int getCMMLevel() {
        return CMMLevel;
    }

    public void setCMMLevel(int CMMLevel) {
        this.CMMLevel = CMMLevel;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        location = location;
    }

    public int getInitial() {
        return Initial;
    }

    public void setInitial(int initial) {
        Initial = initial;
    }

    public int getRepeatable() {
        return Repeatable;
    }

    public void setRepeatable(int repeatable) {
        Repeatable = repeatable;
    }

    public int getDefined() {
        return Defined;
    }

    public void setDefined(int defined) {
        Defined = defined;
    }

    public int getManaged() {
        return Managed;
    }

    public void setManaged(int managed) {
        Managed = managed;
    }

    public int getOptimizing() {
        return Optimizing;
    }

    public void setOptimizing(int optimizing) {
        Optimizing = optimizing;
    }

    public Company() {
    }
}

package com.example.Assignment.Umang;

import org.hibernate.engine.spi.Managed;

import javax.persistence.Entity;
import java.lang.annotation.Repeatable;


public class Data {

    int Initial;
    int Repeatable;
    int Defined;
    int Managed;
    int Optimizing;
    public Data() {
    }

    @Override
    public String toString() {
        return "Data{" +
                "Initial=" + Initial +
                ", Repeatable=" + Repeatable +
                ", Defined=" + Defined +
                ", Managed=" + Managed +
                ", Optimizing=" + Optimizing +
                '}';
    }

    public Data(int initial, int repeatable, int defined, int managed, int optimizing) {
        Initial = initial;
        Repeatable = repeatable;
        Defined = defined;
        Managed = managed;
        Optimizing = optimizing;
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



}

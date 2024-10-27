package com.example.sprinnng.Impl;


import com.example.sprinnng.interfaces.IData;

import org.springframework.stereotype.Component;
@Component("data") //partII
public class DataImpl implements IData {
    private  double data=11.00;
    @Override
    public double getData() {
        System.out.println("dataimpl:::: ");
        return this.data;
    }
}
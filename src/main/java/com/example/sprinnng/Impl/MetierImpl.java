package com.example.sprinnng.Impl;


import com.example.sprinnng.interfaces.IData;
import com.example.sprinnng.interfaces.IMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public abstract class MetierImpl implements IMetier {
    @Qualifier("data") //partII
    @Autowired //partII
    private IData datacall;
    @Override
    public double calcul() {

        return datacall.getData()*2;
    }
    public void setDatacall(DataImpl datacall) {
        this.datacall = datacall;
    }
}
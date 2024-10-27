package com.example.sprinnng.Impl;




import com.example.sprinnng.interfaces.IData;
import org.springframework.stereotype.Component;

@Component //partII
public class DataImplExt implements IData {
    private double data =20.00;
    @Override
    public double getData(){
        return this.data;
    }
}
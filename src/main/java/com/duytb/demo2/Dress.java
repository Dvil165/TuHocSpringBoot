package com.duytb.demo2;

import org.springframework.stereotype.Component;

@Component
public class Dress implements Outfit {
    @Override
    public void wear(){
        System.out.println("Dang mac Vay");
    }
}

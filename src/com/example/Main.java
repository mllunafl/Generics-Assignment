package com.example;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> tmp = new ArrayList<>();
        Wrapper<String> wrapper = new Wrapper<>("Wrapper String");
        if (wrapper.getType().equals(Integer.class.getName())){
            System.out.println("ERROR: Class name = String");
        } else {
            System.out.println("SUCCESS: Class name =  String");
        }
        System.out.println(wrapper);
        System.out.println(wrapper.getType());

        Wrapper<Integer> wrapper2 = new Wrapper<>(8);
        if (wrapper2.getType().equals(Integer.class.getName())){
            System.out.println("SUCCESS:Class name = Interger");
        } else {
            System.out.println("ERROR: Class name = Interger");
        }
        System.out.println(wrapper2);
        System.out.println(wrapper2.getType());

        Wrapper<Double> wrapper3 = new Wrapper<>(3.3);
        if (wrapper3.getType().equals(Double.class.getName())){
            System.out.println("SUCCESS: Class name = Double");
        } else {
            System.out.println("ERROR: Class name = Double");
        }
    }
}

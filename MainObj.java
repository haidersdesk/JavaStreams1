package Inlamning1;

import FactoryExample.Npc;


import java.util.*;

import java.util.stream.Collectors;


public class MainObj {
    public static <object, Arraylist> void main(String[] args) {

        ArrayList<MyObjectInterface> group;
        MyObjFactory data50 = new MyObjFactory();
        data50.createMyObj();



        group = data50.getObjGroup(50);


        // ANALYZING DATA :::::::::::::::::::::::::::::::::::::::


        // All values with less than 20
        List<MyObjectInterface> filteredlist = group
                .stream()
                .filter(x->x.value()>20)
                .collect(Collectors.toList());
                System.out.println("//*Objects with Values above 20 "+filteredlist);



        // Average of all the values
        IntSummaryStatistics statsData =  group
                .stream()
                .mapToInt(MyObjectInterface::value)
                .summaryStatistics();

        System.out.println("//*The average value is "+ statsData.getAverage());



        // Filter to show only true values
        List<MyObjectInterface> filteredlist2 = group
                .stream()
                .filter(MyObjectInterface::bool)
                .collect(Collectors.toList());
                 System.out.println("//*All with trues values "+filteredlist2);




        // Change element name of List object to list String
        List<String> strings = filteredlist2.stream()
                .map(x->x.name().toString())
               .collect(Collectors.toList());

        System.out.println("//*obj to strings "+strings);




    }




}




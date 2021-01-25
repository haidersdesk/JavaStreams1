package Inlamning1;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MyObject implements MyObjectInterface {



    int valueNum;
    boolean bool;
    String name;


    public MyObject() {
         this.valueNum = (int) (Math.random() * 50) + 1;
         Random r = new Random ();
         if (this.valueNum < 18){
             this.bool= false;

         }else{
             this.bool = r.nextBoolean();
         }

         this.name = getRandomName();

    }

    public String getRandomName(){
        List<String> list = new ArrayList<>(Arrays.asList(
               "Yaeko","Brandon","Michele","Lurlene","Buffy","Denita","Walker","Arie","Sheree","Romelia","Maricela",
                "Bridgette","Frances","Cory","Otis","Matilde","Karleen","Hosea","Virgina","Francie","Deja","Vernetta",
                "Loan","Davina","Mervin","Efrain","Cornell","Willena","Sheila","Otto","Elanor","Gennie","Karolyn",
                "Marchelle","Jesusita","Modesto","Milagro","Lura","Nadene","atheleen","Talitha","Catherin","Ulrike",
                "Julienne","Deena","Alissa","Albina","Harrison","Florance","Bobby"
        ));
        Random r = new Random();
        return list.get(r.nextInt(list.size()));
    }



    @Override
    public int value() {
        return this.valueNum;
    }

    @Override
    public boolean bool() {
        return this.bool;

    }

    @Override
    public String name() {
        return this.name;
    }



    @Override
    public void showData() {


        System.out.println("Name: " +this.name);
        System.out.println("Age: " +this.valueNum);
        System.out.println("University Degree: " +this.bool);
        System.out.println("::::::::::::::::::::::::::");


    }

    public String toString(){//overriding the toString() method
        return this.name+" "+this.valueNum+" "+this.bool;
    }



}

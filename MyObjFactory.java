package Inlamning1;

import java.util.ArrayList;



public class MyObjFactory {

    public MyObjectInterface createMyObj(){

        return new MyObject();
    }

    public ArrayList<MyObjectInterface> getObjGroup (int value){

        ArrayList<MyObjectInterface> returnList = new ArrayList<>();

        for (int i=0; i<value; i++){
            returnList.add(createMyObj());

        }
        return returnList;
    }


}




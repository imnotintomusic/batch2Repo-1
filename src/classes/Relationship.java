package classes;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by JPMPC-B217 on 11/15/2016.
 */
public class Relationship {

    //private  Random random;



    public static String getFriends(){

        Random random = new Random();

        ArrayList<String> myfriend = new ArrayList<>();
        myfriend.add("Pogadz");
        myfriend.add("Booc");
        myfriend.add("Richard");
        myfriend.add("Christian");

        int randomIndex = random.nextInt(myfriend.size());
        return myfriend.get(randomIndex);

    }

    public static String getGirlfriend(){

        Random random = new Random();

        ArrayList<String> girlfriend = new  ArrayList<>();
        girlfriend.add("Angel Locsin");
        girlfriend.add("Jesse Mendiola");
        girlfriend.add("Elen Adarna");

        int randomIndex = random.nextInt(girlfriend.size());

        return girlfriend.get(randomIndex);

    }

    public static String getRelationship(){

        Random random = new Random();

        ArrayList<String> relationship = new  ArrayList<>();
        relationship.add("loves");
        relationship.add("has a crush");
        relationship.add("likes");
        relationship.add("is in love with");
        relationship.add("wanna go out with");
        relationship.add("is angry with");
        relationship.add("wanna punch");


        int randomIndex = random.nextInt(relationship.size());;

        return relationship.get(randomIndex);

    }

    public static int interchange(){
        Random random = new Random();
       return  random.nextInt(2);

    }



   /* @Override
    public String toString(){
        return String.format("%s",);
    }*/

}

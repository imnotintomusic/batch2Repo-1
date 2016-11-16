package classes;

/**
 * Created by JPMPC-B217 on 11/12/2016.
 */
public class TestMethod {

    public int total;
    public String friend;

    public TestMethod(){}

    public static int setValue(int limiter){

        int n =1;
        int total = 0;
        while(n<=limiter){
            System.out.print(n);
            total+=n;
            n++;
        }
        return total;
    }

    public static String getIntegers(int limiter){
        int n = 1;
        String str="";
        do{
            str += "["+n+"] ";
            n++;
        }while( n<=limiter);

        return str;

    }

    public static String myFriends(String friend){

        //String[] myFriends = new String[]{"Booc","Richard","Christian"};
        return friend;


    }












}

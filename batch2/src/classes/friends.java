package classes;

/**
 * Created by JPMPC-B217 on 11/14/2016.
 */
public class friends {

    public String str;
    public String girlfriend;

    public friends(String str){
        this.str = str;
    }




    @Override
    public String toString(){
        return String.format("%s",str);
    }



}

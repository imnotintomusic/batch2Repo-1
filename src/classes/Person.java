package classes;

/**
 * Created by JPMPC-B217 on 11/10/2016.
 */
public abstract class Person {


    private  String name;
    private boolean gender;
    private int age;
    private String address;
    private float weight;
    private float height;
    private String Email;




    public Person(){

    }

    public Person(String x){
        this.name = x;
    }



    public String introduceYourself(){
        return this.name;
    }

    public String introduceYourself(String eName,String eAddress){
       return  eName+eAddress;

    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getAddress(){
        return address;
    }

    public void setAddress(String address){
         this.address = address;
    }







}

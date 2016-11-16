





import classes.*;
import java.util.*;


public class Main {




    public static void main(String[] args) {

        /*
        String name = "Hyperboink";
        char single='a';
        short sh = 235;
        int age = 100;
        double dx= 1.22345;
        float fx = 2f;
        boolean gender = true;
        long longTxt = 12343654456757L;
        byte bx = 123;*/



        /*Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        name = input.nextLine();
        System.out.println("Hello "+ name+"!");*/


       // System.out.println(name+"\n"+single+"\n"+int+"\n"+d+"\n"+f+"\n"+longTxt);
      //  System.out.println(name+"\n"+single+"\n"+age+"\n"+dx+"\n"+fx+"\n"+gender+"\n"+longTxt+"\n"+bx+"\n"+sh);
        /*
        int grades[] = new int[]{95,100,98,90,75};

        for(int i=0;i<=grades.length-1;i++){
            System.out.println(grades[i]);
        }

        System.out.println("\n");


        String errors[] = new String[]{"Syntax Error","Eror 404: Brain not found.","Connection Timeout."};


        for(int i=0;i<=errors.length-1;i++){
            System.out.println(errors[i]);
        }*/



       // Person person = new Person("woo");
        Employee employee = new Employee();
        Customer customer = new Customer();


        /*person.setName("Hyperboink");
        person.setAge(21);
        person.setGender(true);
        person.setWeight(50f);
        person.setHeight(160f);
        person.setEmail("hyperboink@gmail.com");*/

        employee.setName("Employee");
        employee.setAge(101);
        employee.setGender(true);
        employee.setWeight(50f);
        employee.setHeight(160f);
        employee.setEmail("hyperboink@gmail.com");
        employee.setDepartment("Dev Department");
        employee.setEmployeeID(21);
        employee.setSssID(123758);
        employee.setPagibigID(123854);

        customer.setName("Customer");
        customer.setAge(101);
        customer.setGender(true);
        customer.setWeight(50f);
        customer.setHeight(160f);
        customer.setEmail("hyperboink@gmail.com");
        customer.setCustomerID(00253);
        customer.setMembershipLevel("Premium");

        customer.setCreditCardNumber(12321365);

       /* System.out.println("Name: "+ person.getName());
        System.out.println("Gender: "+ person.isGender());
        System.out.println("Age: "+person.getAge());
        System.out.println("Weight: "+person.getWeight());
        System.out.println("Height: "+person.getHeight());
        System.out.println("Email: "+person.getEmail());*/

        System.out.println("-------------------------------------");

        System.out.println("Name: "+ employee.getName());
        System.out.println("Gender: "+ employee.isGender());
        System.out.println("Age: "+employee.getAge());
        System.out.println("Weight: "+employee.getWeight());
        System.out.println("Height: "+employee.getHeight());
        System.out.println("Employee ID: "+employee.getEmployeeID());
        System.out.println("SSS: "+employee.getSssID());
        System.out.println("PAGIBIG: "+employee.getPagibigID());

        System.out.println("-------------------------------------");

        System.out.println("Name: "+ customer.getName());
        System.out.println("Gender: "+ customer.isGender());
        System.out.println("Age: "+customer.getAge());
        System.out.println("Weight: "+customer.getWeight());
        System.out.println("Height: "+customer.getHeight());
        System.out.println("Customer ID: "+customer.getCustomerID());
        System.out.println("Membership Level: "+customer.getMembershipLevel());
        System.out.println("Credit Card: "+customer.getCreditCardNumber());

        System.out.println("-------------------------------------");

        //System.out.printf("Hi! I am an %s", employee.introduceYourself());

        System.out.printf(employee.introduceYourself("Hi! I am "+employee.getName()," and I'm in "+employee.getDepartment()));
        System.out.println("!");

        String str = "123659871";

        //str.split(String.valueOf(str.length():","));

        /*for(int i=1;i<=str.length();i++){
            System.out.print(i+" ");
        }*/

       /* int x = 10;
        int y = 5;



        if(x<y){
            System.out.printf("%d is greater than %d",y,x);
        }else{
            System.out.printf("%d is less than %d",y,x);
        }*/

        System.out.println("-------------------------------------");
        System.out.println("-------------------------------------");
        System.out.println("-------------------------------------");
        System.out.println("-------------------------------------");
        System.out.println("\n");
        System.out.println("---------------------1----------------------");

        String[] subject = new String[]{"Math","English","Science","Object Oriented Programming","Server Maintenance"};

        int leastCount = 15;

        String day="Tuesday";
        int totalStudents = 20;

       if(day=="Monday"){
           System.out.printf("Current subject is %s and Teacher 1 has a total of %d students.\n",subject[0],leastCount);
       }else if(day=="Tuesday"){

           if(totalStudents==20){
               System.out.printf("Current subject is %s and Teacher 2 has a total of %d\n",subject[2],totalStudents);
           }else{
               System.out.printf("Current subject is %s and Teacher 2 has a less than or greater than the usual count of students.\n",subject[1]);
               System.out.printf("Current subject is %s and Teacher 4 has a less than or greater than the usual count of students.\n",subject[3]);
               System.out.printf("Current subject is %s and Teacher 5 has a less than or greater than the usual count of students.\n",subject[4]);
           }

       }

        System.out.println("\n");
        System.out.println("---------------------2----------------------");

        String setDay = "weeekend";
        Boolean setHoliday = false;



       /* if(setDay=="weekday" && setHoliday==false){
            System.out.println("Today is not vacation!");
        }else if(setDay == "weekday"  && setHoliday==true){
            System.out.println("Today is vacation!");
        }else if(setDay == "weekend"&& setHoliday==false){
            System.out.println("Today is vacation!");
        }else if(setDay=="weekend" && setHoliday==true){
            System.out.println("Today is vacation!");
        }else{
            System.out.println("Toink!");
        }*/

        System.out.println("\n");
        System.out.println("---------------------3----------------------");



        /*Boolean regular=true;
        Boolean partime=false;


        if(regular==true && partime==false){
            System.out.println("7 Subjects");
        }else if((regular==false&&partime==true)||(regular==true&&partime==true)){
            System.out.println("6 subjects");
        }else{
            System.out.println("5 subjects");
        }*/




        boolean partime = false;
        boolean regular = true;
        char x = 'b';
        int y = 1;


        switch(y){
            case 1:
                System.out.println("this is A");
                break;
            case 2:
                System.out.println("this is B");
                break;

            default:
                System.out.println("Toink!");
        }



        System.out.println("\n");
        System.out.println("---------------------3----------------------");


        System.out.print(TestMethod.getIntegers(9));


        System.out.println("\n-------------------------------------------");

        //System.out.println(TestMethod.getFriends());

        String[] myFriends = new String[]{"Booc","Richard","Christian"};

        for(int i=0;i<myFriends.length;i++){
            System.out.println(myFriends[i]);
        }



        System.out.println("\n---------------My Friends----------------------------");

        /*List<friends> myfriend = new  ArrayList<friends>();
        myfriend.add(new friends("Richard"));
        myfriend.add(new friends("Booc"));
        myfriend.add(new friends("Christian"));
        myfriend.add(new friends("Pogadz"));

       // myfriend.forEach(System.out::println);

        System.out.println("\n---------------Girl Friends----------------------------");

        List<friends> girlfriend = new  ArrayList<>();
        girlfriend.add(new friends("Angel Locsin"));
        girlfriend.add(new friends("Elen Adarna"));
        girlfriend.add(new friends("Jessie Mendioloa"));

       // girlfriend.forEach(System.out::println);



        System.out.println("\n---------------Relationship----------------------------");

        ArrayList<friends> relationship = new ArrayList<>();
        relationship.add(new friends("loves"));
        relationship.add(new friends("hates"));
        relationship.add(new friends("wanna go out with"));
        relationship.add(new friends("wanna punch"));
        relationship.add(new friends("has a crush on"));
        relationship.add(new friends("likes"));
        relationship.add(new friends("is angry with"));
        relationship.add(new friends("secretly inlove with"));


        Random random = new Random();
        int myFriendIndex = random.nextInt(myfriend.size());
        int myGfFriendIndex = random.nextInt(girlfriend.size());
        int theRelationship = random.nextInt(relationship.size());
        int swapName = random.nextInt(2);
        Collections.shuffle(girlfriend);
        Collections.shuffle(relationship);

        System.out.println("\n---------------Random Friends----------------------------");
        System.out.println();
        System.out.println("\n---------------Girlfriend Raffle!----------------------------");


        if(swapName==1){
            System.out.println(girlfriend.get(myGfFriendIndex)+" "+relationship.get(theRelationship)+" "+myfriend.get(myFriendIndex));
        }else{
            System.out.println(myfriend.get(myFriendIndex)+" "+relationship.get(theRelationship)+" "+girlfriend.get(myGfFriendIndex));
        }*/




        System.out.println("\n---------------test!----------------------------");


        /*System.out.print(
                ( Relationship.interchange()==1?Relationship.getGirlfriend():Relationship.getFriends())
                +" "+Relationship.getRelationship()+" "
                +(Relationship.interchange()==0?Relationship.getFriends():Relationship.getGirlfriend())

        );*/

        System.out.println("\n---------------FINAL----------------------------");


        if(Relationship.interchange()==1){
            System.out.printf("%s %s %s",Relationship.getFriends(),Relationship.getRelationship(),Relationship.getGirlfriend());
        }else{
            System.out.printf("%s %s %s",Relationship.getGirlfriend(),Relationship.getRelationship(),Relationship.getFriends());
        }


    }



}

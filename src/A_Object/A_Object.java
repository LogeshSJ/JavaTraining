package A_Object;

public class A_Object {
    String fristname ="Logesh";
    int age=22;
    private String username="sj";
    static  String lastname="virat";

    public static void main(String[]args){
        A_Object object=new A_Object();
        System.out.println(object);
        System.out.println(object.fristname);
        System.out.println(object.age);
        System.out.println(object.username);
        System.out.println(lastname);

        A_Object objectTwo=new A_Object();
        System.out.println(objectTwo);
        System.out.println(objectTwo.fristname);

        A_Object objectThree=new A_Object();
        System.out.println(objectThree);
        System.out.println(objectThree.fristname);

    }
}

package B_Class;

public class B_Class {

    void run(){
        System.out.println("Running");
    }

    public static void main(String[] args) {
        B_Class object=new B_Class();
        object.run();

        Dummy dummyObject =new Dummy();
        dummyObject.dance();
    }
}


package C_Method;

public class C_Method {

    void method() {
        System.out.println("This is a method");
    }

    static int add() {
        return 11 + 13;
    }

    void method(String msg) {
        System.out.println(msg);
    }


    public static void main(String[] args) {
        C_Method object = new C_Method();
        object.method();
        object.method("hi");
        int sum = C_Method.add();
        System.out.println("The sum is" + sum);
    }
}
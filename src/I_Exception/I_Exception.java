package I_Exception;

public class I_Exception {
    public static void main(String[] args) {
        try {
            new Test().add();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        try {
            int a = 12 / 0;
        } catch (Exception e) {
            if (e instanceof ArithmeticException) {
                System.out.println("Error");
            } else {
                System.out.println(e);
            }
        }
    }
}

class Test {
    void add() throws Exception {
        throw new Exception("Custom Exception");
    }
}
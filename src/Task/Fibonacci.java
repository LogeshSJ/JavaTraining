package Task;

public class Fibonacci {
    public static void main(String[] args) {

        int i = 1, n = 10, s = 0, j = 1;
        System.out.println("Fibonacci Series till " + n + " terms:");

        while (i <= n) {
            System.out.print(s + ", ");

            int nextTerm = s + j;
            s = j;
            j = nextTerm;

            i++;
        }
    }
}

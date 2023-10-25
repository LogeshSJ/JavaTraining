package Task;

public class Occurancechar {
    public static void main(String[] args) {
        String str = "thalapthy";
        char ch = 't';
        int c = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch)
                c++;
        }
        System.out.println("Occurrence of " + ch + " is " + c);
    }
}

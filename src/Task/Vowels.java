package Task;

public class Vowels {
    public static void main(String[] args) {


        String s = "logeshvirat";
        String s1 = "";
        s1 = s.replaceAll("[aeiou]", "");
        System.out.println("String after removing vowel : " + s1);
    }

}


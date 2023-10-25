package J_Collection;

import java.util.HashSet;
import java.util.Iterator;

public class J_Set {
    public static void main(String[] args) {
        HashSet<Integer> integers = new HashSet<>();
        integers.add(1);
        integers.add(2);
        integers.add(1);

        System.out.println("For Loop");
        for (int i : integers) {
            System.out.println(i);
        }
        System.out.println("Iterator");
        Iterator<Integer> iterator = integers.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

}

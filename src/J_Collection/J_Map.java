package J_Collection;

import java.util.HashMap;
import java.util.Map;

public class J_Map {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();
        map.put(5,"2001");
        map.put(1,"1");
        map.put(23,"23");
        map.replace(7,"70");
        System.out.println(map.get(5));
    }
}

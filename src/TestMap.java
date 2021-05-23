import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
//        Map<String,Integer> hashMap = new HashMap<>();
//        hashMap.put("ABC",30);
//        hashMap.put("ABD",34);
//        hashMap.put("ABE",31);
//        hashMap.put("ABF",38);
//        hashMap.put("ABG",20);
//        hashMap.put("ABH",40);
////        System.out.println("map : ");
////        System.out.println(hashMap + "\n");
//        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
//        System.out.println("===================");
//        System.out.println(treeMap);
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
        linkedHashMap.put("Smith", 30);
        linkedHashMap.put("Anderson", 31);
        linkedHashMap.put("Lewis", 29);
        linkedHashMap.put("Cook", 29);
        System.out.println("\nThe age for " + "Lewis is " + linkedHashMap.get("Levis"));
    }

}

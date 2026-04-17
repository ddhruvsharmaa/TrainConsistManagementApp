import java.util.*;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();

        map.put("B1", 100);
        map.put("B2", 80);

        for (String key : map.keySet()) {
            System.out.println(key + " Capacity: " + map.get(key));
        }
    }
}
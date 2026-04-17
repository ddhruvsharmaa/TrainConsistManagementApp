import java.util.*;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        Set<String> bogies = new LinkedHashSet<>();

        bogies.add("B3");
        bogies.add("B1");
        bogies.add("B2");

        System.out.println("Insertion Order: " + bogies);
    }
}
import java.util.*;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        Set<String> bogies = new HashSet<>();

        bogies.add("B1");
        bogies.add("B2");
        bogies.add("B1"); // duplicate

        System.out.println("Unique Bogies: " + bogies);
    }
}
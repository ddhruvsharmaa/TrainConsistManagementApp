import java.util.*;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        Set<String> bogies = new TreeSet<>();

        bogies.add("B3");
        bogies.add("B1");
        bogies.add("B2");

        System.out.println("Sorted Bogies: " + bogies);
    }
}
import java.util.*;

class Bogie {
    String id;
    int capacity;

    Bogie(String id, int capacity) {
        this.id = id;
        this.capacity = capacity;
    }
}

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        List<Bogie> list = new ArrayList<>();

        list.add(new Bogie("B1", 100));
        list.add(new Bogie("B2", 80));
        list.add(new Bogie("B3", 120));

        list.sort((a, b) -> a.capacity - b.capacity);

        for (Bogie b : list) {
            System.out.println(b.id + " " + b.capacity);
        }
    }
}
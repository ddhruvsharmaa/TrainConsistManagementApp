import java.util.*;
import java.util.stream.*;

class Bogie {
    String id;
    String type;

    Bogie(String id, String type) {
        this.id = id;
        this.type = type;
    }
}

public class TrainConsistManagementApp {
    public static void main(String[] args) {

        List<Bogie> list = Arrays.asList(
                new Bogie("B1", "Passenger"),
                new Bogie("B2", "Goods"),
                new Bogie("B3", "Passenger")
        );

        List<Bogie> passenger = list.stream()
                .filter(b -> b.type.equals("Passenger"))
                .collect(Collectors.toList());

        passenger.forEach(b -> System.out.println(b.id));
    }
}
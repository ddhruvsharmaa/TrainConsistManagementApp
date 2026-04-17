import java.util.*;
import java.util.stream.*;

class Bogie {
    String id, type;

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

        Map<String, List<Bogie>> grouped =
                list.stream().collect(Collectors.groupingBy(b -> b.type));

        System.out.println(grouped);
    }
}
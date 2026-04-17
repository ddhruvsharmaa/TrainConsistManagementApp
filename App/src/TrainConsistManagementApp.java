import java.util.*;

class Bogie {
    String type;
    int load;

    Bogie(String type, int load) {
        this.type = type;
        this.load = load;
    }
}

public class TrainConsistManagementApp {
    public static void main(String[] args) {

        List<Bogie> list = Arrays.asList(
                new Bogie("Goods", 500),
                new Bogie("Goods", 1200)
        );

        for (Bogie b : list) {
            if (b.type.equals("Goods") && b.load > 1000) {
                System.out.println("Unsafe Bogie");
            }
        }
    }
}
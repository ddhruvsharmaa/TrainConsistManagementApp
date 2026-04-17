public class TrainConsistManagementApp {

    static boolean validateTrainId(String id) {
        return id.matches("TR\\d+");
    }

    public static void main(String[] args) {

        String trainId = "TR101";

        if (validateTrainId(trainId)) {
            System.out.println("Valid Train ID");
        } else {
            System.out.println("Invalid Train ID");
        }
    }
}
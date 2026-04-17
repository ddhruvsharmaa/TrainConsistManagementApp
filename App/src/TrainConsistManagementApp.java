public class TrainConsistManagementApp {
    public static void main(String[] args) {

        int capacity = -10;

        try {
            if (capacity < 0) {
                throw new IllegalArgumentException("Invalid Capacity");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
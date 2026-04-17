import java.util.*;

public class TrainConsistManagementApp {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 100000; i++) list.add(i);

        long start1 = System.nanoTime();
        int sum1 = 0;
        for (int i : list) sum1 += i;
        long end1 = System.nanoTime();

        long start2 = System.nanoTime();
        int sum2 = list.stream().reduce(0, Integer::sum);
        long end2 = System.nanoTime();

        System.out.println("Loop Time: " + (end1 - start1));
        System.out.println("Stream Time: " + (end2 - start2));
    }
}
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int a = sc.nextInt();
        List<Integer> h = new ArrayList<>();
        IntStream.range(0, n).forEach(i -> h.add(sc.nextInt()));

        int palace = 0;
        double nearestMeter = 0;
        for (int i = 0; i < n; i++) {
            double temp = t - h.get(i) * 0.006;
            if (i == 0) {
                palace = i + 1;
                nearestMeter = temp;
            } else if (nearestMeter < Math.abs(temp - a)) {
                palace = i + 1;
            }
        }
        System.out.println(palace);
    }

}

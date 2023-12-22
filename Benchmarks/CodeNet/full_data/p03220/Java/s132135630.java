import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int t = Integer.parseInt(sc.next());
        int a = Integer.parseInt(sc.next());
        Integer[] h = new Integer[n];
        for (int i = 0; i < n; i++) {
            h[i] = Integer.parseInt(sc.next());
        }

        Double[] temperature = new Double[n];
        double min = 100000.0;
        int result = 0;
        for (int i = 0; i < n; i++) {
            temperature[i] = ((double) t - (h[i] * 0.006));
            double difference = Math.abs((double) a - temperature[i]);
            if (min > difference) {
                min = difference;
                result = i + 1;
            }
        }

        System.out.println(result);
    }
}
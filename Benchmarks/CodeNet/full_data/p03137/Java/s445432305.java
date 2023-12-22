import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.streamLine();
    }

    private void streamLine() {
        try (Scanner scan = new Scanner(System.in)) {
            int n = Integer.parseInt(scan.next());
            int m = Integer.parseInt(scan.next());

            if (n > m) {
                System.out.println(0);
            }

            int[] x = IntStream.range(0, m).map(i -> Integer.parseInt(scan.next())).sorted().toArray();
            int[] dx = IntStream.range(0, m - 1).map(i -> x[i + 1] - x[i]).sorted().toArray();

            System.out.println(Arrays.stream(dx).limit((m - 1) - (n - 1)).sum());
        }
    }

    private void polygon() {
        try (Scanner scan = new Scanner(System.in)) {
            int n = Integer.parseInt(scan.next());
            int[] l = IntStream.range(0, n).map(i -> Integer.parseInt(scan.next())).toArray();
            int max = Arrays.stream(l).max().getAsInt();
            int sumWithoutMax = Arrays.stream(l).sum() - max;

            System.out.println(sumWithoutMax > max ? "Yes" : "No");
        }
    }

    private void entranceExamination() {
        try (Scanner scan = new Scanner(System.in)) {
            int t = Integer.parseInt(scan.next());
            int x = Integer.parseInt(scan.next());

            System.out.println((double) t / (double) x);
        }
    }
}

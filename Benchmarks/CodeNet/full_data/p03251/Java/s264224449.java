import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        // input
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int X = scanner.nextInt();
        int Y = scanner.nextInt();
        scanner.nextLine();

        List<Integer> x = Arrays.asList(scanner.nextLine().split(" ")).stream()
                .map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> y = Arrays.asList(scanner.nextLine().split(" ")).stream()
                .map(Integer::parseInt).collect(Collectors.toList());
        System.out.println(x);
        System.out.println(y);

        // xの最大値
        int xMax = x.get(0);
        for (int xi : x) {
            xMax = Math.max(xMax, xi);
        }
        System.out.println(xMax);

        // yの最小値
        int yMin = y.get(0);
        for (int yi : y) {
            yMin = Math.min(yMin, yi);
        }
        System.out.println(yMin);

        // Zが存在するかどうか
        if ((xMax < yMin) && (X < yMin) && (xMax <= Y)) {
            System.out.println("No War");
        } else {
            System.out.println("War");
        }

    }
}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] arg) {

        try (Scanner scanner = new Scanner(System.in)){
            int[] input = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            double w = input[0];
            double h = input[1];
            double x = input[2];
            double y = input[3];

            System.out.println(String.format("%f %d", (w * h) / 2.0, w / 2.0 == x && h / 2.0 == y ? 1 : 0));
        }

    }
}

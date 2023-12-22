import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] arg) {

        try (Scanner scanner = new Scanner(System.in)){
            long[] in = Arrays.stream(scanner.nextLine().split(" ")).mapToLong(Long::parseLong).toArray();
            long n = in[0];
            long a = in[1];
            long b = in[2];
            if (n * a > b) System.out.println(b);
            else System.out.println(n * a);
        }

    }
}

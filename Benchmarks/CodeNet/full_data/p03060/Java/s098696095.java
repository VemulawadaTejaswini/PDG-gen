import java.util.stream.*;
import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int n = scanner.nextInt();
        int[] v = IntStream.range(0, n).map(i -> scanner.nextInt()).toArray();
        System.out.println(IntStream.range(0, n).map(i -> v[i] - scanner.nextInt()).filter(i -> i > 0).sum());
    }
}
import java.util.*;
import java.util.stream.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        System.out.println(IntStream.range(0, scanner.nextInt()).map(i -> scanner.nextInt()).filter(i -> i % 2 == 1).count() % 2 == 0 ? "YES" : "NO");
    }
}
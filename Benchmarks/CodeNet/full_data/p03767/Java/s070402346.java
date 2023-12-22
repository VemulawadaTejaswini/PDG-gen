import java.util.*;
import java.util.stream.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int n = scanner.nextInt();
        System.out.println(IntStream.range(0, 3 * n).mapToLong(i -> scanner.nextLong()).sorted().skip(n).limit(n).sum());
    }
}
import java.util.stream.*;
import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        System.out.println(Arrays.equals(IntStream.range(0, 3).map(i -> scanner.nextInt()).sorted().toArray(), new int[]{5, 5, 7}) ? "YES" : "NO");
    }
}
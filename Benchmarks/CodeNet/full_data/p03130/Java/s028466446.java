import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int[] count = new int[4];
        for (int i = 0; i < 6; i++) {
            count[scanner.nextInt() - 1]++;
        }
        Arrays.sort(count);
        System.out.println(Arrays.equals(count, new int[]{1, 1, 2, 2}) ? "YES" : "NO");
    }
}
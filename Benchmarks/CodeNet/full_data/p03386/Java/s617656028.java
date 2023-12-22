import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), b = in.nextInt(), k = in.nextInt();
        Set<Integer> set = new TreeSet<>();
        for (int i = a; i < Math.min(a + k, b); i++) {
            set.add(i);
        }
        for (int i = Math.max(a, b - k) + 1; i <= b; i++) {
            set.add(i);
        }
        set.forEach(System.out::println);
    }
}

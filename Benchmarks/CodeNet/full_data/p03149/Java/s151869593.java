import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> remaining = new HashSet<>(Arrays.asList(1, 9, 7, 4));
        for (int i=0; i<4; i++) {
            int a = sc.nextInt();
            if (remaining.contains(a)) {
                remaining.remove(a);
            }
        }
        System.out.println(remaining.isEmpty() ? "YES" : "NO");
    }
}

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        sc.close();

        Set<Integer> set = new HashSet<>();
        int prev = s;
        for (int i = 2; i <= 1000000; i++) {
            set.add(prev);
            int next = f(prev);
            if (set.contains(next)) {
                System.out.println(i);
                break;
            }
            prev = next;
        }
    }

    static int f(int input) {
        if (input % 2 == 0) {
            return input / 2;
        } else {
            return 3 * input + 1;
        }
    }
}

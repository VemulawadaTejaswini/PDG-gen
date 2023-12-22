import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] button = new int[n];
        for (int i = 0; i < n; i++) {
            button[i] = sc.nextInt();
        }

        int next = 1;
        boolean can = false;
        Set<Integer> pushed = new HashSet<>();
        while (true) {
            next = button[next - 1];
            if (pushed.contains(next)) {
                break;
            }

            if (next == 2) {
                can = true;
                break;
            }

            pushed.add(next);
        }

        if (can) {
            System.out.println(pushed.size() + 1);
        } else {
            System.out.println(-1);
        }
    }
}

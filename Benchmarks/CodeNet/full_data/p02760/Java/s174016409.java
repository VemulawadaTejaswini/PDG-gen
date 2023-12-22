import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[9];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < 9; i++) {
            map.put(Integer.parseInt(sc.next()), i);
        }
        int n = Integer.parseInt(sc.next());
        for (int i = 0; i < n; i++) {
            int temp = Integer.parseInt(sc.next());
            if (map.containsKey(temp)) {
                a[map.get(temp)]++;
            }
        }
        for (int i = 0; i < 3; i++) {
            boolean ans = true;
            for (int j = i * 3; j < i * 3 + 3; j++) {
                if (a[j] == 0) {
                    ans = false;
                    break;
                }
            }
            if (ans) {
                System.out.println("Yes");
                return;
            }
        }
        for (int i = 0; i < 3; i++) {
            boolean ans = true;
            for (int j = i; j < i + 6; j += 3) {
                if (a[j] == 0) {
                    ans = false;
                    break;
                }
            }
            if (ans) {
                System.out.println("Yes");
                return;
            }
        }
        if (a[0] != 0 && a[4] != 0 && a[8] != 0) {
            System.out.println("Yes");
        } else if (a[2] != 0 && a[4] != 0 && a[6] != 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {

        int a = sc.nextInt();
        if (a < 105) {
            System.out.println(0);
            return;
        }
        int ans = 0;
        int start = a;
        if (a % 2 == 0) {
            start = a - 1;
        }

        while (start >= 1) {
            if (calc(start)) {
//                System.out.println(start);
                ans++;
            }
            start = start - 2;
        }
        System.out.println(ans);
    }

    private static boolean calc(int start) {
        int num = start;
        int count = 2;
        HashMap<Integer, Integer> map = new HashMap<>();
        while (num > 1) {
            if (num % count == 0) {
                num = num / count;
                if (map.containsKey(count)) {
                    map.put(count, map.get(count) + 1);
                } else {
                    map.put(count, 1);
                }
            } else {
                count++;
            }
        }
        int ans = 1;
        for (Integer key : map.keySet()) {
            ans *= (map.get(key) + 1);
        }
        return ans == 8;
    }
}

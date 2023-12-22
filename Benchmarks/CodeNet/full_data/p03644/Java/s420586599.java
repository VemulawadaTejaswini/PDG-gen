import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 1) {
            System.out.println(1); // 1/2 = 0.5??
            System.exit(0);
        }

        Map<Integer, Integer> an = new HashMap<Integer, Integer>();
        for (int i = 1; i <= n; i++) {
            int j = i;
            int c = 0;
            while (j % 2 == 0) {
                c += 1;
                j /= 2;
            }
            an.put(i, c);
        }

        int ans = 0;
        int max = 0;
        for(Entry<Integer, Integer> e : an.entrySet()) {
            if (e.getValue() > max) {
                max = e.getValue();
                ans = e.getKey();
            }
        }
        System.out.println(ans);
    }

}
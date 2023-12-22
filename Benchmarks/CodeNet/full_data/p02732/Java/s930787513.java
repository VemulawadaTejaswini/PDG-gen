import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            if (hm.get(a[i]) == null) {
                hm.put(a[i], 1);
            }
            else {
                hm.put(a[i], hm.get(a[i]) + 1);
            }
        }

        for (int ansIndex = 0; ansIndex < n; ansIndex++) {
            int ans = 0;
            for( int key : hm.keySet()) {
                int tmp = hm.get(key);
                if (key == a[ansIndex]) tmp--;
                if (tmp < 2) continue;
                ans += (tmp * (tmp - 1)) / 2;
            }
            System.out.println(ans);
        }
    }
}
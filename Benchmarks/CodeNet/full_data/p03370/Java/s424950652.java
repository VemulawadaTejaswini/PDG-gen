import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int gram = Integer.parseInt(sc.next());
        int[] donuts = new int[n];
        int min = Integer.MAX_VALUE;
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            donuts[i] = Integer.parseInt(sc.next());
            if (min > donuts[i]) {
                min = donuts[i];
            }
            gram -= donuts[i];
            cnt++;
        }
        while (true) {
            if (gram - min > 0) {
                cnt++;
            } else {
                System.out.println(cnt);
                return;
            }
            gram -= min;
        }
    }
}

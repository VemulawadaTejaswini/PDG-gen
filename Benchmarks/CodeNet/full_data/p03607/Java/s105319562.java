import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        long[] list = new long[n];

        for (int i = 0; i < n; i++) {
            list[i] = sc.nextLong();
        }
        Arrays.sort(list);

        int ans = 0;
        int count = 1;
        long lastV = list[0];

        for (int i = 1; i < n; i++) {
            if (list[i] != lastV) {
                lastV = list[i];
                if (count % 2 == 1) {
                    ans++;
                }
                count = 0;
            }
            count++;
        }

        if (count % 2 == 1) {
            ans++;
        }

        System.out.println(ans);
    }
}
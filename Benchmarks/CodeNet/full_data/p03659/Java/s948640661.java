import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int m = sc.nextInt();
            array[i] = m;
            sum += m;
        }
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (array[i] < array[j]) {
                    int m = array[i];
                    array[i] = array[j];
                    array[j] = m;
                }
            }
        }
        int l = 0;
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < n - 1; i++) {
            l += array[i];
            int o = Math.abs(l - (sum - l));
            if (o < ans) {
                ans = o;
            }
        }
        System.out.println(ans);
    }
}

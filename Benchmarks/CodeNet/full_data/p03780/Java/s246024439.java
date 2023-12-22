import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        long total = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            total += arr[i];
        }
        if (total < k) {
            System.out.println(n);
            return;
        }
        Arrays.sort(arr);
        int left = 0;
        int right = n;
        while (right - left > 1) {
            int m = (left + right) / 2;
            boolean[] check = new boolean[k];
            check[0] = true;
            boolean flag = false;
            for (int i = 0; i < n && !flag; i++) {
                if (i == m) {
                    continue;
                }
                for (int j = k - arr[i] - 1; j >= 0; j--) {
                    if (check[j]) {
                        check[j + arr[i]] = true;
                        if (j + arr[i] >= k - m) {
                            flag = true;
                            break;
                        }
                    }
                }
            }
            if (flag) {
                right = m;
            } else {
                left = m;
            }
        }
        System.out.println(left + 1);
    }
}
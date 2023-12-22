import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[m + 2];
        a[0] = -1;
        for (int i = 1; i <= m; i++) {
            a[i] = sc.nextInt();
        }
        a[m + 1] = n + 1;
        List<Integer> fibList = new ArrayList<>(m);
        fibList.add(1);//1st
        fibList.add(1);//2nd
        long ans = 1L;
        for (int i = 1; i <= m + 1; i++) {
            if (a[i] == a[i - 1] + 1) {
                ans = 0L;
                break;
            } else {
                int len = a[i] - a[i - 1] - 1;
                for (int j = fibList.size(); j <= len; j++) {
                    fibList.add(fibList.get(j - 2) + fibList.get(j - 1));
                }
                ans*=fibList.get(len - 1);
                ans%=1_000_000_007L;
            }
        }
        System.out.println(ans);
    }
}

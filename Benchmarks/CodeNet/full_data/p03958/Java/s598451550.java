import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int t = sc.nextInt();
        int[] a = new int[t];
        int sum = 0;
        for (int i = 0; i < t; i++) {
            a[i] = sc.nextInt();
            sum += a[i];
        }
        Arrays.sort(a);
        sum -= a[t-1];
        int ans = a[t-1]-sum-1 < 0 ? 0 : a[t-1]-sum-1;
        System.out.println(ans);
        sc.close();

    }

}

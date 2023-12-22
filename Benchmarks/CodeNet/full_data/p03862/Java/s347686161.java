import java.util.*;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0;i < n;i++) {
            a[i] = sc.nextInt();
        }
        
        long ret = 0;
        for (int i = 0;i < n-1;i++) {
            int sum = a[i] + a[i+1];
            if (sum>x) {
                int d = sum - x;
                a[i+1] -= d;
                ret += d;
            }
        }
        
        System.out.println(ret);
    }
}

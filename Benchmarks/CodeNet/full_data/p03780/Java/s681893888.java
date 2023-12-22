import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        int n = sc.nextInt();
        int k = sc.nextInt();
        long[] a = new long[n];
        long sum = 0;
        for (int i = 0;i < n;i++){
            a[i] = sc.nextLong();   
            sum += a[i];
        }
        if (sum<k) {
            System.out.println(n);
            return;
        }
        sum = 0;
        for (int i = 0;i < n;i++) {
            if (a[i]<k) sum += a[i];
        }
        int ret = 0;
        for (int i = 0;i < n;i++) {
            long tmp = a[i];
            if (tmp>=k) continue;
            if (sum-tmp>=k) ret++;
        }
        
        System.out.println(ret);
    }
}

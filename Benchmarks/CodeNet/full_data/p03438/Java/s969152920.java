import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        long[] b = new long[n];
        long ans = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            ans += a[i] - b[i];
        }
        if(ans == 0){
            System.out.println("Yes");
            return;
        }
        if(ans % 2 == 0){
            System.out.println("No");
            return;
        }
        System.out.println("Yes");
    }
}

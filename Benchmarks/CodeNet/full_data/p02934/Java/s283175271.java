import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        double[] a = new double[n];
        for(int i = 0;i<n;i++){
            a[i] = Integer.parseInt(sc.next());
        }
        double ans = 0;
        for(int i = 0;i<n;i++){
            ans += 1/a[i];
        }
        ans = 1/ans;
        System.out.println(ans);
    }
}
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] al = new long[n];
        long[] bl = new long[n];
        for(int i = 0; i < n; i++){
            al[i] = sc.nextLong();
            bl[i] = sc.nextLong();
        }
        long ans = 0;
        for(int i = n-1; i >= 0; i--){
            long tmp = (al[i] + ans) % bl[i];
            ans += tmp == 0 ? 0 : bl[i] - tmp;
        }
        System.out.println(ans);
    }
}

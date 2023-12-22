import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        long[] a = new long[n];
        long ans = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }
        Arrays.sort(a);
        long[][] b = new long[m][2];
        for (int i = 0; i < m; i++) {
            b[i][0] = sc.nextLong();
            b[i][1] = sc.nextLong();
        }
        Arrays.sort(b, (x, y) -> Long.compare(y[1], x[1]));
        boolean end = false;
        int idx = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < b[i][0]; j++) {
                if(a[idx] < b[i][1] && idx <= n-1){
                    a[idx] = b[i][1];
                    idx++;
                }else{
                    end = true;
                    break;
                }
            }
            if(end) break;
        }
        for (int i = 0; i < n; i++) ans += a[i];
        System.out.println(ans);
        sc.close();

    }

}

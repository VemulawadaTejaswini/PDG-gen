import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long t = 0L;
        long[][] a = new long[n][2];
        for (int i = 0; i < n; i++) {
            a[i][0] = sc.nextLong();
            a[i][1] = sc.nextLong();
        }
        Arrays.sort(a, (x, y) -> Long.compare(x[1], y[1]));
        String ans = "Yes";
        for (int i = 0; i < n; i++) {
            t += a[i][0];
            if(a[i][1] < t){
                ans = "No";
                break;
            }
        }
        System.out.println(ans);
        sc.close();

    }

}

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] a = new int[m][2];
        for (int i = 0; i < m; i++) {
            a[i][0] = sc.nextInt()-1;
            a[i][1] = sc.nextInt()-1;
        }
        Arrays.sort(a, (x,y)->y[0]-x[0]);
        int[] b = new int[n];
        Arrays.fill(b, -1);
        for (int i = 0; i < m; i++) {
            if(b[a[i][1]] < 0) b[a[i][1]] = a[i][0];
        }
        int ans = 0;
        int idx = 0;
        for (int i = 1; i < n; i++) {
            if(idx <= b[i]){
                ans++;
                idx = i;
            }
        }
        System.out.println(ans);
        sc.close();

    }

}

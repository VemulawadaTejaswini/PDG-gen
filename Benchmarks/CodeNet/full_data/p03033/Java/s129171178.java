import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        int[][] a = new int[n*2][3];
        for (int i = 0; i < n; i++) {
            int s = sc.nextInt();
            int t = sc.nextInt();
            int x = sc.nextInt();
            a[i+n][0] = s - x;
            a[i+n][1] = 1;
            a[i+n][2] = x;
            a[i][0] = t - x;
            a[i][1] = -1;
            a[i][2] = x;
        }
        Arrays.sort(a, (x, y) -> x[0] - y[0]);
        int[] d = new int[q];
        for (int i = 0; i < q; i++) {
            d[i] = sc.nextInt();
        }
        int[] ans = new int[q];
        Arrays.fill(ans, -1);
        TreeSet<Integer> set = new TreeSet<>();
        int idx = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n*2; i++) {
            while(idx < q && d[idx] < a[i][0]){
                if(set.isEmpty()) ans[idx] = -1;
                else ans[idx] = set.first();
                idx++;
            }
            if(idx == q) break;
            if(a[i][1] == 1){
                set.add(a[i][2]);
            }else{
                set.remove(a[i][2]);
            }
        }
        for (int i = 0; i < q; i++) {
            sb.append(ans[i]).append("\n");
        }
        System.out.println(sb.toString());
        sc.close();

    }

}

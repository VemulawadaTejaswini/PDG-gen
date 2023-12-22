import java.util.*;
class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] a = new int[n][m];
        int[] k = new int[n];
        for(int i = 0; i < n; i++){
            k[i] = sc.nextInt();
            for(int j = 0; j < k[i]; j++){
                a[i][j] = sc.nextInt() - 1;
            }
        }
        int ans = 0;
        for(int j = 0; j < m; j++){
            for(int i = 0; i < n; i++){
                boolean flag = false;
                for(int x = 0; x < k[i]; x++){
                    if(a[i][x] == j) flag = true;
                }
                if(!flag) break;
                if(i == n-1) ans++;
            }
        }
        System.out.println(ans);
    }
}
 
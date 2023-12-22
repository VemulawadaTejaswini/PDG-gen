import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long m = sc.nextLong();
        int[] a = new int[n];
        for (int i=0; i<n; i++) a[i] = sc.nextInt();
        Arrays.sort(a);
        int[][] aa = new int[n][n];
        for (int i=0; i<n; i++){
            for (int j=0; j<n;j++){
                aa[i][j] = a[i]+a[j];
            }
        }

        int[] arr = new int[n*n];
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                arr[i*n+j] = aa[i][j];
            }
        }
        Arrays.sort(arr);

        long ans = 0;

        for (int i=n*n-1; i>=n*n-m; i--){
            ans += arr[i];
        }
        System.out.println(ans);
    }
}
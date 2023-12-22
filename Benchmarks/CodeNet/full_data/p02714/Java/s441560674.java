import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        char[] c = sc.next().toCharArray();
        for(int i=0; i<n; i++) {
            if(c[i] == 'R') {
                a[i] = 0;
            } else if(c[i] == 'G') {
                a[i] = 1;
            } else {
                a[i] = 2;
            }
        }
        int[][] sum = new int[3][n+1];
        for(int i=0; i<n; i++) {
            sum[0][i+1] = sum[0][i];
            sum[1][i+1] = sum[1][i];
            sum[2][i+1] = sum[2][i];
            sum[a[i]][i+1] = sum[a[i]][i] + 1;
        }

        long res = 0;
        for(int i=0;i < n; i++) {
            for(int j=i+1; j<n; j++) {
                if(a[i] == a[j]) continue;
                int col = 3 - a[i] - a[j];
                res += sum[col][n]-sum[col][j+1];
                int q = j + j - i;
                if(q < n && a[q] == col) res--;
            }
        }
        System.out.println(res);
    }



}
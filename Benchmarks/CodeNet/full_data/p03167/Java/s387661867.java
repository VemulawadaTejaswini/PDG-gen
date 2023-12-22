import java.io.IOException;
import java.util.Scanner;

class Main {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        long MOD = (long)(Math.pow(10, 9) +7);
        int n = sc.nextInt();
        int m = sc.nextInt();
        char a[][] = new char[n][m];
        long res[][] = new long[n][m];
        for(int i=0;i<n;i++) {
            String s = sc.next();
            for(int j=0;j<m;j++) {
               a[i][j] = s.charAt(j);
            }
        }
        res[n-1][m-1] = 0;
        for(int i=n-2;i>=0;i--) {
            if(i== n-2) {
                if(a[i][m-1] == '.') res[i][m-1] = 1;
                else res[i][m-1] = 0;
            }
            else {
                if(a[i][m-1] == '.') res[i][m-1] = (res[i+1][m-1])%MOD;
                else res[i][m-1] = 0;
            }
        }

        for(int i=m-2;i>=0;i--) {
            if(i== (m-2)) {
                if(a[n-1][i] == '.') res[n-1][i] = 1;
                else res[n-1][i] = 0;
            }
            else {
                if(a[n-1][i] == '.') res[n-1][i] = (res[n-1][i+1])%MOD;
                else res[n-1][i] = 0;
            }
        }
        for(int i= n-2;i>=0;i--) {
            for(int j=m-2;j>=0;j--) {
                if(a[i][j] != '#') {
                    res[i][j] = (res[i][j+1]+ res[i+1][j])%MOD;
                }
            }
        }
        System.out.println(res[0][0]%MOD);
    }
}

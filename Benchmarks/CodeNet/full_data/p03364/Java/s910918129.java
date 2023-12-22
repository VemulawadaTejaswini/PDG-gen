import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] b1 = new int[n][n];
        int[][] b2 = new int[n][n];
        for(int i=0; i<n; i++){
            String s = sc.next();
            for(int j=0; j<n; j++){
                b1[i][j] = s.charAt(j);
            }
        }
        int ans = 0;
        for(int i=0; i<n; i++){
            b2 = move(b1, n, i);
            if(check(b2, n)) ans += n;
        }
        System.out.println(ans);
    }

    public static int[][] move(int[][] b, int n, int m){
        int[][] ret = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i+m < n){
                    ret[i][j] = b[i+m][j];
                }else{
                    ret[i][j] = b[i+m-n][j];
                }
            }
        }
        return ret;
    }

    public static boolean check(int[][] b, int n){
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                if(b[i][j] != b[j][i]) return false;
            }
        }
        return true;
    }
}
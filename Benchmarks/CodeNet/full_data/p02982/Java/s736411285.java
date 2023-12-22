import java.util.*;
import java.math.*;
import java.io.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int cnt = 0;
        int[][] ar = new int[n][d];
        double[][] dist = new double[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < d; j++) {
                ar[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                for (int k = 0; k < d; k++) {
                    dist[i][j] += Math.pow(Math.abs(ar[i][k]-ar[j][k]),2);
                }
                dist[i][j] = Math.sqrt(dist[i][j]);
                if(dist[i][j]-(int)dist[i][j] == 0){
                    cnt++;
                }
            }
        }
        System.out.println(cnt);

    }
}

class io{
    public static void br(){
        System.out.println("");
    }

    public static void YesNo(boolean f) {
        System.out.println(f?"Yes":"No");
    }
    public static void YESNO(boolean f) {
        System.out.println(f?"YES":"NO");
    }

}

class Algo{
    public static boolean isOdd(int n){
        return n % 2 == 1;
    }
    public static boolean isEven(int n){
        return n % 2 == 0;
    }


}


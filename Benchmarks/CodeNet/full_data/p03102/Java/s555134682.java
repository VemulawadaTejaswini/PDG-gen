import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int c = sc.nextInt();
        int[][] a = new int[n][m];
        int[] b = new int[m];
        for(int i = 0 ; i < m ; i++ ){
            b[i] = sc.nextInt();
        }
        for(int i = 0 ; i < n ; i++ ){
            for(int j = 0 ; j < m ; j++ ){
                a[i][j] = sc.nextInt() * b[j];
                if(j != 0){
                    a[i][0] += a[i][j];
                }
            }
        }
        sc.close();
        int s = 0;
        for(int i = 0 ; i < n ; i++ ){
            if(a[i][0] + c > 0){
                s++;
            }
        }
        System.out.println(s);
    }
}
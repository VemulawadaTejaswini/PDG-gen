import java.util.*;
public class Main {
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                int[][] a = new int[n][3];
                for(int i = 0 ; i < n ; i++){
                        for(int j = 0 ; j < 3 ; j++){
                                a[i][j] = sc.nextInt();
                        }
                }
                sc.close();
                int[][] q = new int[n][3];
                for(int i = 0 ; i < 3 ; i++){
                        q[0][i] = a[0][i];
                }
                for(int i = 1 ; i < n ; i++){
                        q[i][0] = Math.max(q[i - 1][1] , q[i - 1][2]) + a[i][0];
                        q[i][1] = Math.max(q[i - 1][2] , q[i - 1][0]) + a[i][1];
                        q[i][2] = Math.max(q[i - 1][0] , q[i - 1][1]) + a[i][2];
                }
                Arrays.sort(q[n - 1]);
                System.out.println(q[n - 1][2]);
        }
}
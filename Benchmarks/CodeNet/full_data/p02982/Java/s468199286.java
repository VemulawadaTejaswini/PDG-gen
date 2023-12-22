import java.util.*;
import java.math.*;
import java.io.*;


public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]) {
        int n = sc.nextInt();
        int d = sc.nextInt();
        int[][] x = new int[n][d];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < d; j++) {
                x[i][j] = sc.nextInt();
            }
        }
        HashMap<Integer, Boolean> m = new HashMap<>();
        for(int i = 1; i < 10000; i++) {
            m.put(i * i, true);
        }
        int ans = 0;
        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                int tmp = 0;
                for(int k = 0; k < d; k++) {
                    tmp += (x[i][k] - x[j][k]) * (x[i][k] - x[j][k]);
                }
                if(m.containsKey(tmp)) ans++;
            }
        }
        System.out.println(ans);
    } 
}
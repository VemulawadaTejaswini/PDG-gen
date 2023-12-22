import java.util.*;
import java.io.InputStreamReader;
import java.io.BufferedReader;


public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] s = br.readLine().split(" ");
        int[] a = new int[n+2];
        
        for (int i = 0; i < n; i++) {
            a[i+1] = Integer.parseInt(s[i]);
        }
        
        int distance = 0;
        for (int i = 0; i <= n; i++) {
            distance += Math.abs(a[i+1]-a[i]);
        }
        
        //System.out.println(distance);
        int init_dis = distance;
        
        for (int i = 1; i <= n; i++) {
            distance -= Math.abs(a[i+1]-a[i]) + Math.abs(a[i]-a[i-1]) - Math.abs(a[i+1]-a[i-1]);
            System.out.println(distance);
            distance = init_dis;
        }
        
    }
}




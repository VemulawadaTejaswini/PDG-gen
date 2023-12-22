import java.util.*;
import java.io.InputStreamReader;
import java.io.BufferedReader;


public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] s = br.readLine().split(" ");
        int[] a = new int[n];
        
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(s[i]);
        }
        
        int distance = 0;
        for (int i = 1; i < n; i++) {
            distance += Math.abs(a[i]-a[i-1]);
        }
        distance += (Math.abs(a[0]) + Math.abs(a[n-1]));
        int init_dis = distance;
        //System.out.println(distance);
        
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                if ((0 <= a[i] && a[i] <= a[i+1]) || (0 >= a[i] && a[i] >= a[i+1])) {
                    
                }
                else {
                    distance -= Math.abs(a[i])*2; 
                }
            }
            else if (i == n-1) {
                if ((a[i-1] <= a[i] && a[i] <= 0) || (a[i-1] >= a[i] && a[i] >= 0)) {
                    
                }
                else {
                    if (a[i]*a[i-1] >= 0) {
                        distance -= Math.abs(a[i]-a[i-1])*2; 
                    }
                    else {
                        distance -= Math.abs(a[i])*2;
                    }
                }
            }
            else {
                if ((a[i-1] <= a[i] && a[i] <= a[i+1]) || (a[i-1] >= a[i] && a[i] >= a[i+1])) {
                    
                }
                else {
                    distance -= Math.abs(a[i]-a[i-1])*2; 
                }
            }
            System.out.println(distance);
            distance = init_dis;
        }
    }
}




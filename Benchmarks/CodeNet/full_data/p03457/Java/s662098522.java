import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] t = new int[N+1];
        int[] x = new int[N+1];
        int[] y = new int[N+1];
        int[] dist = new int[N];
        int[] t_diff = new int[N];
        t[0] = 0; x[0] = 0; y[0] = 0;
        for(int i = 1; i < N+1; i++){
            t[i] = in.nextInt();
            x[i] = in.nextInt();
            y[i] = in.nextInt();
        }
        String ret = "Yes";
        for(int i = 0; i < N; i++){
            dist[i] = Math.abs(x[i] - x[i+1]) + Math.abs(y[i] - y[i+1]);
            t_diff[i] = t[i+1] - t[i];
            if(dist[i] > t_diff[i] || (t_diff[i] - dist[i])%2==1 ){
                ret = "No";
                break;    
            }
        }
        System.out.println(ret);
        in.close();
    }
}

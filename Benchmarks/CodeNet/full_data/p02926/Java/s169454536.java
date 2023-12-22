import java.util.*;
import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] x = new long[N];
        long[] y = new long[N];
        for (int i=0;i<N;i++){
            x[i] = sc.nextLong();
            y[i] = sc.nextLong();
            //System.out.printf("%d %d\n",x[i],y[i]);
        }
        
        double ans = 0;
        for (int d = 0; d<1800;d++){
            long temp = 0;
            long tx = 0;
            long ty = 0;
            for (int i=0;i<N;i++){
                if (x[i]*Math.cos(d*Math.PI/180)+y[i]*Math.sin(d*Math.PI/180)>0){
                    tx += x[i];
                    ty += y[i];
                }
            }
            //System.out.printf("%d %d\n",tx,ty);
            if (ans < Math.sqrt(tx*tx+ty*ty)){
                ans = Math.sqrt(tx*tx+ty*ty);
            }
        }
        System.out.printf("%f\n",ans);
    }
}

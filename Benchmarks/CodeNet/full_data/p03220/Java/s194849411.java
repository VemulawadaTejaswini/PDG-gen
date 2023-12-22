import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double t = sc.nextDouble();
        double a = sc.nextDouble();
        double[] h = new double[n];
        double[] tem = new double[n];
        int ans = 0;
        double min = 9999;
        double sabun = 0;

        for(int i = 0;i<n;i++){
            h[i] = sc.nextDouble();
            tem[i] = t-h[i]*0.006;
            sabun = Math.abs(a-tem[i]);
            if(min>sabun){
                min= sabun;
                ans = i+1;
            }
        }
        System.out.println(ans);




        
    }
}

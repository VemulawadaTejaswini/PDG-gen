import java.util.*;
import java.lang.Math;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] x = new int[N];
        int[] y = new int[N];
        for(int i = 0; i < N; i++){
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        double result = 0;
        int n = 1;
        for(int i = 0; i < N; i++){
            n *= (i + 1);
            for(int j = 0; j < N; j++){
                result += Math.sqrt((x[i] - x[j])*(x[i]-x[j])+(y[i] - y[j])*(y[i] - y[j]));
            }
        }
        System.out.println(result / (double)n * (n / N));
    }
}

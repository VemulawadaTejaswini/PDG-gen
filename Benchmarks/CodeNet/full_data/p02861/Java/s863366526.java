import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] x = new int[N];
        int[] y = new int[N];
        double[][] r = new double[N][N];
        double sum = 0;
        int a = 1;

        for(int i=1; i<=N; i++){
            a *= i;
        }

        for(int i=0; i<N; i++){
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                if(j!=i){
                    r[i][j] = Math.sqrt(Math.pow(x[i] - x[j], 2) + Math.pow(y[i] - y[j], 2));
                    sum += r[i][j] * a / N;
                }
            }
        }
        System.out.println(sum/a);
    }
}
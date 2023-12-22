import java.util.*;
public class Main {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        double [] P = new double[N];
        double [] L = new double[N];
        for(int i=0;i<N;i++){
            int p = sc.nextInt();
            double sum = 0;
            for(int j=1;j<=p;j++) sum+=j;
            sum/=p;
            P[i]=sum;
        }
        double max = 0;
        for(int i=0;i<N-K;i++){
            double sum = 0;
            for(int j=i+1;j<i+1+K;j++)sum+=P[j];
            if(sum>max) max = sum;
        }
        System.out.println(max);
    }
}

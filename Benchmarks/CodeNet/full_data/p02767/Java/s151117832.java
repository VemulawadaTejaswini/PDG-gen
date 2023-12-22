import java.util.*;
class Main{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] X = new int[N];
        int[] sq = new int[N];

        for(int i=0;i<N;i++){
            X[i] = 0;
            sq[i] = 0;
        }

        for(int i=0;i<N;i++){
            X[i] = scan.nextInt();
            sq[i] = X[i]*X[i];
        }

        double avg = Sum(X, N)/(double)N;
        System.out.println(avg);

        System.out.println((int)Math.ceil(f(X,N)));

        scan.close();
    }

    public static int Sum(int[] x,int N){
        int sum = 0;
        for(int i=0;i<N;i++){
            sum += x[i];
        }

        return sum;
    }

    public static double f(int[]X,int N){
        double val = 0;

        for(int i=0;i<N;i++){
            val += ((double)X[i]-(double)(Sum(X,N))/N)*((double)X[i]-(double)(Sum(X,N))/N);
        }

        return val;
    }

}

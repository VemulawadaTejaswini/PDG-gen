import java.util.*;
 
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
 
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] x = new int[N];
        int minans = 0;

        for(int i=0; i<N; i++){
            x[i] = sc.nextInt();
            minans += Math.abs(x[i]);
        }
        for(int i=0; i<=N-K; i++){
            int min = Math.min(Math.abs(x[i]) + Math.abs(x[i] - x[i + K - 1]), Math.abs(x[i + K - 1]) + Math.abs(x[i] - x[i + K - 1]));
            minans = Math.min(minans, min);
        }
        System.out.println(minans);
    }
}
import java.util.*;
public class Main {
    
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int[] log2 = new int[K+1];
        log2[0] = 0;
        log2[1] = 1;
        int pow2 = 2;
        for (int i = 2; i <=K; i++) {
            if(i <= pow2) log2[i] = log2[i-1];
            else if(pow2 < i){
                log2[i] = log2[i-1] + 1;
                pow2 *= 2;
            }
        }
        // for (int i = 0; i < K+1; i++) {
        //     System.out.println(log2[i]);
        // }
        double ans = 0;
        for (int i = 1; i <= N; i++) {
            double prob = 1.0/N;
            int score = i;
            while(score<K){
                score = score * 2;
                prob = prob * 0.5;
            }
            ans += prob;
        }
        System.out.println(ans);
    }
}
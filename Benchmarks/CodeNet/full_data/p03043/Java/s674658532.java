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
        double prob = 0;
        for (int i = 1; i <= N; i++) {
            prob += 1.0/N * Math.pow(0.5,log2[K/i]);
        }
        System.out.println(prob);
    }
}
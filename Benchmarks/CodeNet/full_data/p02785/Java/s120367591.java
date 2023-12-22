import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long K = sc.nextLong();
        long[] H = new long[(int) N];
        
        for(int i = 0; i < N; i++){
            H[i] = sc.nextLong();
        }
        Arrays.sort(H);
        long sum = 0;
        for(int i = 0; i < N - K; i++){
            sum += H[i];
        }
        System.out.println(sum);
    }
}
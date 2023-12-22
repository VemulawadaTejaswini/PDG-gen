import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] H = new int[N];
        for (int i = 0; i < N; i++) {
            H[i] = sc.nextInt();
        }

        long ans=0;

        Arrays.sort(H);

        if(H.length <= K){
            System.out.println(0);
        }else{
            for (int i = 0; i < N - K; i++) {
                ans += H[i];
            }
            System.out.println(ans);
        }

    }
}

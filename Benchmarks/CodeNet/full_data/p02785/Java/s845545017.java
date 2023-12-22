import java.util.*;

public class Main {
    public static void main(String[] args) {
        int N;
        int K;
        int[] Hi = null;
        try (Scanner sc = new Scanner(System.in)) {
            N = sc.nextInt();
            K = sc.nextInt();
            Hi = new int[N];
            for (int i = 0; i < N; i++) {
                Hi[i] = sc.nextInt();
            }
        }
        Arrays.sort(Hi);
        if(K > 0){
            if(K > Hi.length){
                K = Hi.length;
            }
            Arrays.fill(Hi,Hi.length-K,Hi.length ,0);
        }
        long result = 0;
        for(int attack : Hi){
            result += attack;
        }
        System.out.println(result);
    }
}

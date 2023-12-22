import java.util.*;

public class Main {
    private static boolean[] prime = new boolean[105];
    public static void sieve(){
        Arrays.fill(prime, true);
        prime[1] = false;
        for (int i=2; i<=100; i++){
            if (!prime[i]) continue;
            else {
                for (int j=2*i; j<=100; j+=i) prime[j] = false;
            }
        }
    }

    public static void main(String[] args){
        int N;
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        sieve();
        int cont = 0;
        for (int i=1; i<=N; i++){
            if (prime[i]) cont++;
        }
        System.out.printf("%.9f\n", cont*1.0/N);
    }
}

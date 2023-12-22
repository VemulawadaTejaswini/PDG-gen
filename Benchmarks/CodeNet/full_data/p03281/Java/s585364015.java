import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> primes = primeList(200);

        int N = scanner.nextInt();

        int[] nums = new int[201];

        for(int i=1; i<=200; i++){
            for(int j=1; j<=i; j++){
                if(i%j == 0){
                    nums[i]++;
                }
            }
        }

        int cnt = 0;
        for(int i=1; i<=N; i+=2){
            if(nums[i] == 8){
                cnt++;
            }
        }

        System.out.println(cnt);


    }

    static List<Integer> primeList(int n) {
        List<Integer> list = new ArrayList<>();
        boolean[] prime = new boolean[n + 1];
        Arrays.fill(prime, true);
        prime[0] = false;
        prime[1] = false;
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (!prime[i]) continue;
            for (int j = 2; i * j <= n; j++) {
                prime[i * j] = false;
            }
        }
        for (int i = 0; i < prime.length; i++) {
            if (prime[i]) list.add(i);
        }

        return list;
    }
}

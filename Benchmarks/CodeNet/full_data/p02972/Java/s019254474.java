import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        ArrayList<Integer> primes = (ArrayList<Integer>) primeList(N);
        primes.add(1);

        Collections.sort(primes, Collections.reverseOrder());

        ArrayList<Integer> original = new ArrayList<>();

        for(int i=0; i<N; i++){
            original.add(scanner.nextInt());
        }

        boolean[] visited = new boolean[N];
        int[] ans = new int[N];
        int cnt = 0;

        for(int prime: primes){
            int currentIdx = (N/prime) * prime - 1;
            int nextIdx = currentIdx;

            int acc   = 0;

            while(true){
                if(nextIdx < 0){
                    break;
                }

                currentIdx = nextIdx;
                if(original.get(currentIdx)==1 && acc%2==0 && visited[currentIdx]){
                    System.out.println(-1);
                    return;
                }

                if(original.get(currentIdx)==1){
                    if(acc%2 == 0) {
                        ans[currentIdx] = 1;
                        cnt++;
                    }else{
                        ans[currentIdx] = 0;
                    }
                }
                if(original.get(currentIdx)==0){
                    if(acc%2 == 0) {
                        ans[currentIdx] = 0;
                    }else{
                        ans[currentIdx] = 1;
                        cnt++;
                    }
                }
                visited[currentIdx] = true;
                nextIdx = currentIdx - prime;
            }


        }
        System.out.println(cnt);

        int tmp = 0;
        for(int i=0; i<N; i++){
            if(ans[i] == 1) {
                if (tmp == 0) {
                    System.out.print(i+1);
                    tmp++;
                } else {
                    System.out.print(" " + i+1);
                }
            }
        }
    }


    static List<Integer> primeList(int n) {
        List<Integer> list = new ArrayList<>();
        boolean[] prime = new boolean[n+1];
        Arrays.fill(prime,true);
        prime[0]=false; prime[1]=false;
        for (int i=2; i<Math.sqrt(n); i++) {
            if (!prime[i]) continue;
            for (int j=2; i*j<=n; j++) {
                prime[i*j] = false;
            }
        }
        for (int i=0; i<prime.length; i++) {
            if (prime[i]) list.add(i);
        }
        return list;
    }
}

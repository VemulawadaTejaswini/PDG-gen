import java.util.*;
import java.text.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        new Main().run();
    }

    void run() {

        int q = sc.nextInt();
        int[][] arr = new int[q][2];
        int[] cnt = new int[100010];
        boolean[] flag = new boolean[100010];
        for (int i=0; i<q; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

//        System.out.println(eratosthenes(100002));

        List<Integer> primes = eratosthenes(100002);

//        System.out.println(primes.size());

        for (Integer t: primes) {
            if ( (t+1) % 2 != 0) continue;
            if (primes.contains((t+1) / 2)) flag[t] = true;
        }
        flag[2] = false;
        for (int i=1; i<cnt.length; i++) {
            if (flag[i]) {
                cnt[i] = cnt[i-1] + 1;
            } else {
                cnt[i] = cnt[i-1];
            }
        }

//        System.out.println(Arrays.toString(flag));
//        System.out.println(Arrays.toString(cnt));

        StringBuilder sb = new StringBuilder();

        for (int i=0; i<q; i++) {
            int l = arr[i][0];
            int r = arr[i][1];
            sb.append(cnt[r] - cnt[l-1] + "\n");
        }

        System.out.println(sb.toString());

    }

    List<Integer> eratosthenes(int n) {
        boolean[] flag = new boolean[n+1];
        int sqrt = (int)Math.sqrt(n);

        for (int i=2; i<=sqrt; i++) {
            if (!flag[i]) {
                for (int j=i*2; j<=n; j+=i) {
                    flag[j] = true;
                }
            }
        }

        List<Integer> list = new ArrayList<>();
        for (int i=2; i<=n; i++) {
            if (!flag[i]) list.add(i);
        }
        return list;

    }


}

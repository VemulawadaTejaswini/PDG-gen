import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] v = new int[n];
        for (int i = 0; i < n; i++) v[i] = sc.nextInt();
        long ans = 0L;
        int max = Math.min(n, k);
        for (int l = 0; l <= max; l++) {
            for (int r = 0; r <= max - l; r++) {
                long tmp = 0L;
                PriorityQueue<Integer> pq = new PriorityQueue<>();
                for (int i = 0; i < l; i++) {
                    tmp += v[i];
                    if(v[i] < 0) pq.add(v[i]);
                }
                for (int i = 0; i < r; i++) {
                    tmp += v[n-1-i];
                    if(v[i] < 0) pq.add(v[n-1-i]);
                }
                int cnt = 0;
                while(0 < k -l -r -cnt && !pq.isEmpty()){
                    tmp -= pq.poll();
                    cnt++;
                }
                if(ans < tmp) ans = tmp;
            }
        }

        System.out.println(ans);
        sc.close();

    }

}

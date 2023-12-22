import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        long[] v = new long[N+1];

        long max = Long.MIN_VALUE;
        for(int i = 1; i<=N; i++) {
            v[i] = sc.nextLong();
        }
        for(int i = 0; i<=N; i++) {
            for(int j = 0; j<=N; j++) {
                if(i+j > N) continue;
                if(K-i-j < 0) continue;
                long tmp = 0;
                PriorityQueue<Long> queue = new PriorityQueue<Long>();
                for(int l = 1; l<=N; l++) {
                    if(l<=i || (N-j+1)<=l) {
                        tmp += v[l];
                        queue.add(v[l]);
                    }
                }
                for(int l = 0; l<(K-i-j); l++) {
                    if(queue.size()!=0) tmp -= queue.poll();
                }
                //System.out.println(i+" " + j+" " + tmp);
                max = Math.max(max, tmp);
            }
        }
        System.out.println(max);
    }
}
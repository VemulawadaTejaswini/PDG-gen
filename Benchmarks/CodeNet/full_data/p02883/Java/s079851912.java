import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        long k = sc.nextLong();
        int[] a = new int[n];
        long sum = 0;
        Integer[] f = new Integer[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            sum += a[i];
        }
        for (int i = 0; i < n; i++) {
            f[i] = sc.nextInt();
        }
        if(sum <= k){
            System.out.println(0);
            return;
        }
        Object ans = gluttony(n, k, a, f);
        System.out.println(ans);
    }

    private static int gluttony(int n, long k, int[] a, Integer[] f) {
        Arrays.sort(a);
        Arrays.sort(f, (n1, n2) -> n2 - n1);
        PriorityQueue<Integer[]> pq = new PriorityQueue<>((o1, o2) -> o2[0] - o1[0]);
        for(int i = 0; i < n; i++){
            pq.add(new Integer[]{a[i] * f[i], i});
        }
        Integer[] res = pq.poll();
        while(k > 0 && res[0] > 0){
            int i = res[1];
            a[i]--;
            k--;
            pq.add(new Integer[]{a[i] * f[i], i});
            res = pq.poll();
        }
        return res[0];
    }

}
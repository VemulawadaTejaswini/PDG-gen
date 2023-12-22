import java.util.*;

public class Main {
    static long steps[];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        Set<Integer> a = new HashSet<Integer>(M);
        steps = new long[N+1];
        for(int i=1; i<=M; i++) {
            int tmp = sc.nextInt();
            a.add(tmp);
        }

        steps[0] = 1L;
        steps[1] = a.contains(1) ? 0L : 1L;
        steps[2] = a.contains(2) ? 0L : (steps[0] + steps[1]) % 1000000007L;
        for(int i=2; i<=N; i++) {
            steps[i] = a.contains(i) ? 0L : (steps[i-2] + steps[i-1]) % 1000000007L;
        }
        System.out.println(steps[N]);
    }
}
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int Q = sc.nextInt();
        TreeSet<Long> sSet = new TreeSet<>();
        TreeSet<Long> tSet = new TreeSet<>();
        long INF=(long)1e13;
        sSet.add(INF);
        sSet.add(-INF);
        tSet.add(INF);
        tSet.add(-INF);
        for(int i = 0; i < A; i++) {
            sSet.add(sc.nextLong());
        }
        for(int i = 0; i < B; i++) {
            tSet.add(sc.nextLong());
        }
        for(int i = 0; i < Q; i++) {
            long num = sc.nextLong();
            long a = sSet.ceiling(num) - num;
            long b = num - sSet.floor(num);
            long c = tSet.ceiling(num) - num;
            long d = num - tSet.floor(num);

            long candidate1 = Math.min(Math.max(a, c), a + d + Math.min(a, d));
            long candidate2 = Math.min(Math.max(b, d), b + c + Math.min(b, c));
            long min = Math.min(candidate1, candidate2);
            System.out.println(min);
        }
    }
}

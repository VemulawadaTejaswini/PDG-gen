import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int[] a = new int[N];
        int sum = 0;
        Map<Integer, List<Integer>> map = new HashMap<>();
        for(int i=0; i<N; i++) {
            a[i] = Integer.parseInt(sc.next());
            sum += a[i];
        }
        long sunuke = 0;
        long araiguma = sum;
        long min = Long.MAX_VALUE;
        for(int i=0; i<N-1; i++) {
            sunuke += a[i];
            araiguma -= a[i];
            if(min > sa(sunuke, araiguma)) min = sa(sunuke, araiguma);
        }
        System.out.println(min);
    }   
    //差の絶対値
    static long sa(long a, long c) {
        if(a <= c) return c-a;
        else return a-c;
    }
}

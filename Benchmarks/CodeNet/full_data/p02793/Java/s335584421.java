import java.util.*;

public class Main {
    private static long MOD = 1000000007L;
    private static int count = 0;
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        List<Long> numList = new LinkedList<>();
        for(int i=0;i<N;i++){
            numList.add(Long.parseLong(sc.next()));
        }
        long lcmNum = numList
                    .stream()
                    .reduce(numList.get(0),(s1,s2) -> s1 * s2 / gcd(s1,s2));
        long res =numList
                .stream()
                .parallel()
                .map(s -> (lcmNum / s))
                .reduce(0L,(s1,s2) -> s1 + s2);
        System.out.println(res % MOD);
    }
    
    public static long gcd(long m,long n){
        if(m < n) return gcd(n , m);
        if(n == 0) return m;
        long res = n;
        while(m % n != 0){
            res = m % n;
            m = n;
            n = res;
        }
        return res;
    }
}

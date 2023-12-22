import java.util.*;

public class Main {
    static long ans = 1001001001001001018L;;
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        divisorList(n);
        System.out.println(ans);
    }
        
    public static List<Long> divisorList(long n) {
        List<Long> res = new ArrayList<Long>();
        for (long i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                res.add(i);
                
                long j = n / i;
                if (j != i) {
                    res.add(j);
                    
                    String s = String.valueOf(i);
                    String t = String.valueOf(j);
                    ans = Math.min(ans, Math.max(s.length(), t.length()));
                } else {
                    String u = String.valueOf(i);
                    ans = Math.min(ans, u.length());
                }
            }
        }
        res.sort(Comparator.naturalOrder());
        
        return res;
    }
}

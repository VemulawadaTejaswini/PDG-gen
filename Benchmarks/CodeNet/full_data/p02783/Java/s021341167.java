import java.util.*;
public class Main { 
    static Map<Long, Long> cache = new HashMap<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long cnt = helper(n);
        System.out.println(cnt);
    }

    private static Long helper(long h) {
       if(cache.containsKey(h))
         return cache.get(h);
       if(h == 1) {
         	cache.put(h, 1L);
            return 1L;
       }
       long cnt = helper(h/2) + helper(h/2) + 1L;
       cache.put(h, cnt);
       return cnt;
    }
}
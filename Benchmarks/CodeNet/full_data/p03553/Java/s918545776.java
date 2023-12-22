import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] array = new long[n+1];
        for (int i = 1; i <= n; i++) {
            array[i] = sc.nextInt();
        }
        
        long[] point_multiple = new long[n+1];
        for (int i = 1; i <= n; i++) {
            point_multiple[i] = array[i];
        }
        
        boolean[] choose = new boolean[n+1];
        
        for (int i = n; i >= 1; i--) {
            if (point_multiple[i] > 0) {
                choose[i] = true;
                
                List<Long> list = divisorList(i);
                for (long j : list) {
                    point_multiple[(int)j] += array[i];
                }
            } else {
                for (int j = i; j <= n; j += i) {
                    if (choose[j]) {
                        List<Long> list = divisorList(i);
                        for (long k : list) {
                            point_multiple[(int)k] += array[i];
                        }
                        
                        choose[j] = false;
                    }
                }
            }
        }
        
        long ans = 0;
        for (int i = 1; i <= n; i++) {
            if (choose[i]) {
                // System.out.println(i);
                ans += array[i];
            }
        }
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
                }
            }
        }
        res.sort(Comparator.naturalOrder());
        
        return res;
    }
}

import java.util.*;

public class Main {
    static int border;
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        border = m / n;
        
        List<Long> list = divisorList(m);
        
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println(list.get(i));
            return;
        }
    }
    
    public static List<Long> divisorList(long n) {
        List<Long> res = new ArrayList<Long>();
        for (long i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                if (border >= i) {
                res.add(i);
                }
                long j = n / i;
                if (j != i) {
                    if (border >= j) {
                    res.add(j);
                    }
                }
            }
        }
        res.sort(Comparator.naturalOrder());
        
        return res;
    }
}
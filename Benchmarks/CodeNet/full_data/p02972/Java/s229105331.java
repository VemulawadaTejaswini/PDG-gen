import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        
        int count = 0;
        int[] tmp = new int[n];
        for (int i = n; i >= 1; i--) {
            if (array[i-1] == 0) {
                if (tmp[i-1] % 2 == 0) {
                    
                } else {
                    List<Long> list = divisorList(i);
                    for (long num : list) {
                        tmp[(int)num-1]++;
                    }
                    count++;
                }
            } else {
                if (tmp[i-1] % 2 == 0) {
                    List<Long> list = divisorList(i);
                    for (long num : list) {
                        tmp[(int)num-1]++;
                    }
                    count++;
                } else {
                    
                }
            }
        }
        
        System.out.println(count);
        if (count == 0) return;
        for (int i = 0; i < n; i++) {
            if (tmp[i] % 2 == 0) continue; 
            System.out.print(i+1);
            if (i != n - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
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

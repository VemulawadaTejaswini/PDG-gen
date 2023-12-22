import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; ++i) a[i] = sc.nextInt() >> 1;
        
        if(!existX(a, n)) {
            System.out.println(0);
            return;
        }
        
        long minX = findArrayLcm(a, n);
        long q = m / minX;
        long ans = q >> 1;
        if(q % 2 == 1) ++ans;
        System.out.println(ans);
    }
    
    static boolean existX(int[] ar, int size) {
        if(size == 1) return true;
        int fact2Count = countFactor(ar[0], 2);
        for(int i = 1; i < size; ++i) {
            if(fact2Count != countFactor(ar[i], 2)) return false;
        }
        return true;
    }
    
    static int countFactor(int num, int factor) {
        int res = 0;
        while(num % factor == 0) {
            ++res;
            num /= factor;
        }
        return res;
    }
    
    static long findGcd(long a, long b) {
        if(a < b) return findGcd(b, a);
        if(b == 0) return a;
        return findGcd(b, a % b);
    }
    
    static long findLcm(long a, long b) {
        long gcd = findGcd(a, b);
        long res = a / gcd * b;
        return res;
    }
    
    static long findArrayLcm(int[] ar, int size) {
        if(size == 1) return ar[0];
        long res = ar[0];
        for(int i = 1; i < size; ++i) res = findLcm(res, ar[i]);
        return res;
    }
}
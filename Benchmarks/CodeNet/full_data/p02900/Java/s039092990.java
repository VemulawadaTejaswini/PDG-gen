import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long gcd = gcd(Math.max(a,b),Math.min(a,b));
        TreeMap<Long,Long> hash = factorization(gcd);
        System.out.println(hash.size()+1);
    }
    static long gcd(long x,long y){
        if (y==0)return x;
        else return gcd(y,x%y);
    }
    static TreeMap<Long,Long> factorization(long num){
        TreeMap<Long,Long> hash = new TreeMap<>();
        long n = num;
        long count = 2;
        while (n>1){
            while (n%count==0){
                n/=count;
                if (hash.containsKey(count))hash.put(count,hash.get(count)+1);
                else hash.put(count,1L);
            }
            count++;
        }
        return hash;
    }
}

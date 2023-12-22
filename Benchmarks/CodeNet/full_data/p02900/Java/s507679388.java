import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        HashSet<Long> set = getPrimeSet(Math.max(a,b));
        long ans = 1;
        for(long l : set){
            if(a % l == 0 && b % l == 0) ans++;
        }
        System.out.println(ans);
    }
    
    public static HashSet<Long> getPrimeSet(long l){
        long powl = l;
        HashSet<Long> ret = new HashSet<Long>();
        boolean div2 = false;
        while(powl % 2 == 0){
            div2 = true;
            powl /= 2;
        }
        if(div2) ret.add((long)2);
        long i = 3;
        while(powl >= i){
            boolean divi = false;
            while(powl % i == 0){
                divi = true;
                powl /= i;
            }
            if(divi) ret.add(i);
            i += 2;
        }
        return ret;
    }
}

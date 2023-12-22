import java.util.*;
import java.awt.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(in);
        long n=sc.nextLong();
        long m=sc.nextLong();
        String s=sc.next();
        String t=sc.next();
        long lcm=n/gcd(n,m)*m;
        HashMap<Long,Character> mapS=new HashMap<>();
        HashMap<Long,Character> mapT=new HashMap<>();
        for (long i = 0; i < n; i++) {
            mapS.put((long)(i*lcm/n+1),s.charAt((int)i));
        }
        for (long i = 0; i < m; i++) {
            mapT.put(i*lcm/m+1,t.charAt((int)i));
        }
        for (long i = 1; i <= lcm; i++) {
            if(mapS.get(i)!=null&&mapT.get(i)!=null&&mapS.get(i)!=mapT.get(i)){
                out.println(-1);
                exit(0);
            }
        }
        out.println(lcm);
    }
    static long gcd (long a, long b) {
        long temp;
        while((temp = a%b)!=0) {
            a = b;
            b = temp;
        }
        return b;
    }
}
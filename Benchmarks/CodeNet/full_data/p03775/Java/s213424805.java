import java.util.*;
public class Main{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        List<String> b = new ArrayList<>();
        List<Long> c = new ArrayList<>();
        int ans = Long.toString(a).length();
        for(long i=1; i<=a/2; i++) {
            if(a%i ==0) {
                c.add(i);
            }
        }
        for(long e : c) {
            for(long f: c) {
                if(a == e*f) {
                    long g = e > f ? e : f;
                    b.add(Long.toString(g));
                }
            }
        }
        for(String d : b) {
            if(ans > d.length()) {
                ans = d.length();
            }
        }
        System.out.println(ans);
    }
}
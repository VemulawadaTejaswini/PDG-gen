import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long m = sc.nextLong();
        String s = sc.next();
        String t = sc.next();
        long seki = lcm(n, m);
        long NL = seki / n;
        long ML = seki / m;
        
        int sCount = 0;
        int tCount = 0;
        int ss = 0;
        int tt = 0;
        boolean flag = true;
        for(int i = 0;i < seki;i ++){
            if(ss == tt){
                if(s.charAt(sCount) != t.charAt(tCount)){
                    flag = false;
                }
                sCount++;
                tCount++;
                ss += NL;
                tt += ML;
            }else if(ss < tt){
                sCount++;
                ss += NL;
            }else{
                tCount ++;
                tt += ML;
            }
            if(ss >= seki)break;
            if(tt >= seki)break;

        }
        if(flag){
            System.out.println(seki);    
        }else{
            System.out.println(-1);
        }
        

    }

    private static long lcm(long m, long n) {
        return m * n / gcd(m, n);
    }

    private static long gcd(long m, long n) {
        if (m < n)
            return gcd(n, m);
        if (n == 0)
            return m;
        return gcd(n, m % n);
    }
}
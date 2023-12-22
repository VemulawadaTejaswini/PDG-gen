import java.util.Scanner;

public class Main {

    static long gcd (long a, long b) {return b>0?gcd(b,a%b):a;}
    static long lcm (long a, long b) {return a*b/gcd(a,b);}

    
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        long C = sc.nextLong();
        long D = sc.nextLong();
        
        long cc = 0;
        long dc = 0;
        long ccd = 0;
        for(long ci = A%C == 0? A : C*((A/C)+1); ci<=B; ci+=C) {
            System.out.println(ci);
            cc++;
        }
        for(long di = A%D == 0? A : D*((A/D)+1); di<=B; di+=D) {
            dc++;
            System.out.println(di);
        }
        long lcm = lcm(C, D);

        for(long cdi = A%lcm == 0? A : lcm*((A/lcm)+1); cdi<=B; cdi+=(C*D)) {
            ccd++;
            System.out.println(cdi);
        }
        
        System.out.println(B-A+1-cc-dc+ccd);
    }
}
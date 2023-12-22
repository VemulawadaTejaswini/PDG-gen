import java.util.*;
public class Main {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        long gcd = 1;
        gcd = GCD(A,B,gcd);
        int opt = 1;
        for(long i=2;i<=gcd;i++){
            if(A%i==0&&B%i==0){
                boolean check = true;
                for(int j=2;j<=(int)Math.sqrt(i);j++) if(i%j==0) check = false;
                if(check)opt++;
            }
        }
        System.out.println(opt);
    }
    public static long GCD(long A,long B,long gcd){
        long r = A%B;
        if(r!=0){
            A = B;
            B = r;
            gcd = GCD(A,B,gcd);
        }
        else gcd = B;
        return gcd;
    }
}
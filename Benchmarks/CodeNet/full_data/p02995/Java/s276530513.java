import java.util.*;

public class Main{
    public static long gcd(long n, long m){
        if(m < n){
            return gcd(m,n);
        }
        if(n==0){
            return m;
        }
        return gcd(n, m%n);
    }
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        long A = scanner.nextLong();
        long B = scanner.nextLong();
        long C = scanner.nextLong();
        long D = scanner.nextLong();

        long lcmCD = C * D / gcd(C,D);

        long divC = Math.floorDiv(B, C) - Math.floorDiv(A-1, C);
        long divD = Math.floorDiv(B, D) - Math.floorDiv(A-1, D);
        long divCD = Math.floorDiv(B, lcmCD) - Math.floorDiv(A-1, lcmCD);
        long undiv = B - A + 1 - divC - divD + divCD;

        System.out.println(undiv);
    }
}
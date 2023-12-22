import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        long C = sc.nextLong();
        long D = sc.nextLong();
        long CD = C*D/gcd(C,D);
        long ans = B -B/C - B/D + B/CD -( A-1 -(A-1)/C- (A-1)/D+(A-1)/CD );
        System.out.println(ans);

//        System.out.println(gcd(15L,20L));
    }

    static long gcd(long a, long b)
    {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }


}

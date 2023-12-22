import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        long c = scanner.nextLong();
        long d = scanner.nextLong();
        long all = b - a + 1;
        long canDivC=b/ c - a/ c ;
        long canDivD=b/ d - a/ d ;
        long canDivCD= b/ lcm(c,d) - a/ lcm(c,d);
        if (a % c == 0) {
            canDivC++;
        }
        if (a % d == 0) {
            canDivD++;
        }
        if (a % (c * d) == 0) {
            canDivCD++;
        }
        System.out.println(all - canDivC - canDivD + canDivCD);
    }

    private static long lcm(long a, long b) {
            long temp;
            long c = a;
            c *= b;
            while((temp = a%b)!=0) {
                a = b;
                b = temp;
            }
            return (long)(c/b);

        }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long l = in.nextLong();
        long r = in.nextLong();
        long min = Long.MAX_VALUE;
        long r1 = Math.min(r, l+2019);
        for(long i=l; i<=r1; i++) {
            long r2 = Math.min(r, i+2019);
            for(long j=i+1; j<=r2; j++) {
                long mod = (i*j)%2019;
                min = Math.min(min, mod);
            }
        }
        System.out.println(min);
    }
}

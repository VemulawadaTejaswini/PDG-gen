import java.util.Scanner;

public class Main {

    static long fanc(long a, long b) {
        long fa = 0, fb = 0;
        while(a != 0) {
            a /= 10;
            fa++;
        }
        while(b != 0) {
            b /= 10;
            fb++;
        }
        return ((fa < fb) ? fb : fa);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        long N = scan.nextLong();
        long a,b,min = N;

        for(a = 1; a <= Math.sqrt(N); a++) {
            if(N%a!=0) {
                continue;
            }
            b = N/a;
            min = (min < fanc(a, b) ? min : fanc(a, b));
            //System.out.println(a + " " + b + " " + min);
        }

        System.out.println(min);
    }
}
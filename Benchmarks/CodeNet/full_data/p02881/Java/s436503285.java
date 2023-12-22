import java.util.Scanner;
import java.lang.Math;
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long i = 10000000000000000L;
        for (long j=1; j<=Math.sqrt((double)n)+1; j++) {
        		if(n%j == 0) {
        			long k = n/j;
        			if (i > (j+k-2)) i = j+k-2;
        		}
        }
        System.out.println(i);
    }
}
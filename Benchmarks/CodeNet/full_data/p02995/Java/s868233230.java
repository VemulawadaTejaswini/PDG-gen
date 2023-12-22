
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long a = s.nextLong();
        long b = s.nextLong();
        long c = s.nextLong();
        long d = s.nextLong();

        long e = b-a;
        int i=1;
        long k = Math.max(c,d);
        int g = 0;
        while(i<=k){
           if(c%i==0&&d%i==0){
               g=i;
           }
           i++;
        }
        long min = c*d / g;
        long f = e / min;
        System.out.println(e-(e/c+e/d)+f);
    }
}

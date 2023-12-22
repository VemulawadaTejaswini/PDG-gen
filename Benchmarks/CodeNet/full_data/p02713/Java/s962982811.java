import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        long sum = 0;
        for(int a=1; a<=k; a++) {
            for(int b=1; b<=k; b++) {
                int b2 = gcd(a, b);
                for(int c=1; c<=k; c++) {
                    sum += gcd(b2, c);
                }
            }
        }
        System.out.println(sum);
    }
    private static int gcd(int a, int b) {
        if(a==b) {
            return a;
        }
        if(b>a) {
            // swap
            int s = a;
            a = b;
            b = s;
        }
        while(true) {
            int mod = a % b;
            if(mod==0) {
                return b;
            }
            a = b;
            b = mod;
        }
    }
}

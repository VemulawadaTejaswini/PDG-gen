import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        long result = 0L;
        for(int a=1; a<=K; a++) {
            for(int b=1; b<=K; b++) {
                int gcd_ab = gcd(a, b);
                for(int c=1; c<=K; c++) {
                    int gcd_abc = gcd(gcd_ab, c);
                    result+=gcd_abc;
                }
            }
        }
        System.out.println(String.format("%d", result));
    }
    static int gcd (int a, int b) {
        int temp;
        while((temp = a%b)!=0) {
            a = b;
            b = temp;
        }
        return b;
    }
}

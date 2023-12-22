import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        
        int a = 0;
        int b = 0;
        int c = 0;
        int sum = 0;
        
        for(int i = 1; i <= K; i++) {
            for(int j = 1; j <= K; j++) {
                for(int k = 1; k <= K; k++) {
                    sum += gcd(gcd(i, j), k);
                }   
            }
        }
        System.out.println(sum);
        
    }
    static int gcd(int x, int y) {
        int amari = 0;
        if(x % y == 0) {
            return y;
        }else {
            amari = x % y;
            return gcd(y, amari);
        }
    }
}
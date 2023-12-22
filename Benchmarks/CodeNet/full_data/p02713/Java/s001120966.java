import java.util.*;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        long sum = 0;
        int tmpGcd = 0;
        for (int i = 1; i <= K; i++){
            for (int j = 1; j <= K; j++){
                for (int k = 1; k <= K; k++){
                    tmpGcd = gcd(i, j);
                    sum += gcd(tmpGcd, k);
                }
            }
        }
        System.out.println(sum);

    }

    public static int gcd (int a, int b){
        int tmp = 0;
        if (a == 0) return b;
        if (b == 0) return a;
        if (a > b){
            tmp = a;
            a = b;
            b = tmp;
        }
        return gcd(b % a, a);
    }
}
import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int K = sc.nextInt();

        long sum = 0;

        for(int i = 1; i <= K; i++){
            for(int j = 1; j <= K; j++){
                for(int k = 1; k <= K; k++){
                    // System.out.printf("%d %d %d %d\n", i, j, k, gcd(i, j, k));
                    sum += gcd(i, j, k);
                }
            }
        }

        System.out.println(sum);
        sc.close();
    }

    private static int gcd(int a, int b, int c){
        return gcd(a, gcd(b, c));
    }

    private static int gcd(int a, int b){
        if(a >= b){
            if(b == 0){
                return a;
            } else {
                return gcd(b, a%b);
            }
        } else {
            return gcd(b, a);
        }

    }
}

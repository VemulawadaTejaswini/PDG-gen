import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int K = input.nextInt();
        long ans = 0L;
        for (int i = 1; i < K+1; i++){
            for (int j = 1; j < K+1; j++){
                int tmp = gcd(i,j);
                for (int k = 1; k < K+1; k++){
                    ans += gcd(tmp,k);
                }
            }
        }
        System.out.println(ans);
    }
    static int gcd(int a, int b){
        return b > 0 ? gcd(b,a%b) : a;
    }
}
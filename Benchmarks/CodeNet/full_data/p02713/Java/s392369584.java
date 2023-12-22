
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int result = 0;
        for (int i = 1; i <= num; i++){
            for (int j = 1; j <= num; j++){
                for (int k = 1; k <= num; k++){
                    int gcdK = gcd(i,j);
                    int gcdResult = gcd(gcdK, k);
                    result = result + gcdResult;
                }
            }
        }
        System.out.println(result);
    }
    public static int gcd(int a, int b){
        int c = a % b;
        if (c == 0 ){
            return b;
        } else {
            return gcd(b, c);
        }
    }
}

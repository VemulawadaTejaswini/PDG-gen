import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    private static BigInteger Max = new BigInteger("1000000000000000000");
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        BigInteger[] input = new BigInteger[N];

        for(int i = 0; i < N; i++){
            input[i] = new BigInteger(sc.next());
        }
        BigInteger result = BigInteger.ONE;
        for(BigInteger temp : input){
            result = LCM(result , temp);
        }
        if(result.compareTo(Max) >= 0)result = Max;
        System.out.println(result.toString());


    }

    private static BigInteger GCD(BigInteger a, BigInteger b){
	    return a.gcd(b);
    }

    private static BigInteger LCM(BigInteger a, BigInteger b){
        if(b.compareTo(Max) >= 0){
            return Max;
        }else{
            return a.multiply(b).divide(GCD(a,b));
        }

    }
}
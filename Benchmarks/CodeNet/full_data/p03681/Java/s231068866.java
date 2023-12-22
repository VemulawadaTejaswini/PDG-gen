import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
	public static final int mod = 1000000007;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt(),m = scanner.nextInt();
		if(Math.abs(n-m) > 1){
			System.out.println(0);
		}else{
			BigDecimal sum = new BigDecimal("0");
			n = fact(n);
			m = fact(m);
			BigDecimal N = new BigDecimal(String.valueOf(n));
			BigDecimal M = new BigDecimal(String.valueOf(m));
			sum = N.multiply(M);
			BigDecimal MOD = new BigDecimal("1000000007");
			sum = sum.remainder(MOD);
			if(Math.abs(n-m) > 0){
				System.out.println(sum);
			}else{
				BigDecimal two = new BigDecimal("2");
				sum = sum.multiply(two);
				sum = sum.remainder(MOD);
				System.out.println(sum);
			}
		}
	}
	public static int fact(int n){
		long fact = 1;
		if (n == 0){
			return  (int)fact;
		}else {
			for(int i=n;i>0;i--){
				fact *= i;
				fact %= mod;
			}
			return (int)fact;
		}
	}
}

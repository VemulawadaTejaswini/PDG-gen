
import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int a = in.nextInt();
		int b = in.nextInt();

		long answer;

		if(n==1 && a!=b){
			System.out.println(0);
		}else if(a>b){
			System.out.println(0);
		}else{
			Integer iB = b;
			BigInteger bigB = new BigInteger(iB.toString());
			Integer iA = a;
			BigInteger bigA = new BigInteger(iA.toString());
			Integer iN = n-2;
			BigInteger bigN = new BigInteger(iN.toString());

			BigInteger big = bigB.subtract(bigA);
			big = big.multiply(bigN);
			BigInteger one = new BigInteger("1");
			big = big.add(one);
			System.out.println(big);
		}
	}
}

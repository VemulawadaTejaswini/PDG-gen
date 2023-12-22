import java.math.BigInteger;
import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int P = scan.nextInt();
		if(P==0){
			BigInteger a = new BigInteger("2");
			a = a.pow((N-1));
			System.out.println(a.toString());
		}else{
			BigInteger a = new BigInteger("2");
			a = a.pow((N-1));
			BigInteger b = new BigInteger("2");
			b = b.pow(N);
			b = b.subtract(a);
			System.out.println(b.toString());
		}
	}

}

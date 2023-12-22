import java.math.BigInteger;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		BigInteger x = new BigInteger(sc.next());
		BigInteger y = new BigInteger(sc.next());
		if(x.subtract(y).compareTo(BigInteger.valueOf(2)) == -1){
			System.out.println("Brown");
		}
		else{
			System.out.println("Alice");
		}
		
		sc.close();
	}
}
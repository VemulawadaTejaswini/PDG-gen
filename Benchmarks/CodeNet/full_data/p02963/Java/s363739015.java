import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BigInteger s = new BigInteger(br.readLine());
		
		BigInteger limit = new BigInteger("1000000000");
		BigInteger x = BigInteger.ONE;
		while(true){
			x = x.add(BigInteger.ONE);
			if( limit.compareTo(s.divide(x)) >= 0 && s.remainder(x).equals(BigInteger.ZERO) )
				break;
		}
		
		System.out.println("0 0 0 " + s.divide(x) + " " + x + " 0");
	}
}

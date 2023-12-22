import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] dataStr = br.readLine().split(" ");
		int n = Integer.parseInt(dataStr[0]);
		int k = Integer.parseInt(dataStr[1]);
		
		for(int i=1; i<=k; i++)
			System.out.println(combination(new BigInteger(Integer.toString(k-1)), new BigInteger(Integer.toString(i-1))).multiply(combination(new BigInteger(Integer.toString(n-k+1)), new BigInteger(Integer.toString(i)))).remainder(new BigInteger("1000000007")));
	}
	
	private static BigInteger combination(BigInteger n, BigInteger r){
		BigInteger result = BigInteger.ONE;
		BigInteger i;
		if( r.compareTo(n.subtract(r)) > 0 )
			r = n.subtract(r);
		for(i=BigInteger.ZERO; i.compareTo(r) < 0; i.add(BigInteger.ONE))
			result = result.multiply(n.subtract(i));
		for(i=new BigInteger("2"); i.compareTo(r) <= 0; i.add(BigInteger.ONE))
			result = result.divide(i);
		return result;
	}
}

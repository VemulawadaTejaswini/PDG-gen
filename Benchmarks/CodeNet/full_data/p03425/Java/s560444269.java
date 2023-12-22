
import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}

	Scanner sc = new Scanner(System.in);

	void run() {
		
		int n = sc.nextInt();
		int[] count = new int['Z'+1];
		for(int i = 0 ; i < n ; i++){
			String b = sc.next();
			
			count[b.charAt(0)]++;
		}
		
		BigInteger mar = BigInteger.valueOf(count['M']).multiply(BigInteger.valueOf(count['A']).multiply(BigInteger.valueOf(count['R'])));
		BigInteger mac = BigInteger.valueOf(count['M']).multiply(BigInteger.valueOf(count['A']).multiply(BigInteger.valueOf(count['C'])));
		BigInteger mah = BigInteger.valueOf(count['M']).multiply(BigInteger.valueOf(count['A']).multiply(BigInteger.valueOf(count['H'])));
		BigInteger mrc = BigInteger.valueOf(count['M']).multiply(BigInteger.valueOf(count['R']).multiply(BigInteger.valueOf(count['C'])));
		BigInteger mrh = BigInteger.valueOf(count['M']).multiply(BigInteger.valueOf(count['R']).multiply(BigInteger.valueOf(count['H'])));
		BigInteger mch = BigInteger.valueOf(count['M']).multiply(BigInteger.valueOf(count['C']).multiply(BigInteger.valueOf(count['H'])));
		BigInteger arc = BigInteger.valueOf(count['A']).multiply(BigInteger.valueOf(count['R']).multiply(BigInteger.valueOf(count['C'])));
		BigInteger arh = BigInteger.valueOf(count['A']).multiply(BigInteger.valueOf(count['R']).multiply(BigInteger.valueOf(count['H'])));
		BigInteger ach = BigInteger.valueOf(count['A']).multiply(BigInteger.valueOf(count['C']).multiply(BigInteger.valueOf(count['H'])));
		BigInteger rch = BigInteger.valueOf(count['R']).multiply(BigInteger.valueOf(count['C']).multiply(BigInteger.valueOf(count['H'])));
		
		System.out.println(mar.add(mac).add(mah).add(mrc).add(mrh).add(mch).add(arc).add(arh).add(ach).add(rch));
	}
}

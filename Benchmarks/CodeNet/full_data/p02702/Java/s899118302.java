import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;
 
public class Main {
 
	public static final MyScanner in = new MyScanner();

	public static void main(String[] args) {

		char[] S = in.next().toCharArray();
		long cnt = 0;
		StringBuilder sb = new StringBuilder();
		sb.append("2");
//		while(sb.length() < 20000) {
//			sb.append("0");
//		}
//		S = sb.toString().toCharArray();
//		System.out.println(S);
		BigInteger t = BigInteger.valueOf(2019);
		for(int i=0; i < S.length - 3; i++) {
			if(S[i]=='0') {
//				System.out.println(S[i]);
				continue;
			}
			int inta = ((int)S[i]-48) * 1000
					+ ((int)S[i+1]-48) * 100
					+ ((int)S[i+2]-48) * 10
					+ ((int)S[i+3]-48);
			if(inta % 2019 == 0) {
				cnt++;
				//System.out.println(num);
			}
			BigInteger num = BigInteger.valueOf(inta);
			for(int j=i+4; j < S.length; j++) {
				num = num.multiply(BigInteger.valueOf(10)).add(BigInteger.valueOf((int)S[j]-48));
				//System.out.println(num);
				if(num.remainder(t).intValue() == 0) {
					cnt++;
					//System.out.println(num);
				}
			}
		}
		System.out.println(cnt);
	}



	public static class MyScanner {
		Scanner sc = new Scanner(System.in);
		String next() { return sc.next();}
		int nextInt() { return Integer.valueOf(sc.next());}
		long nextLong() { return Long.valueOf(sc.next()); }
	}
}
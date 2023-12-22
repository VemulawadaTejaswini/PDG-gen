import java.io.*;
import java.util.*;
import java.math.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String buf;
		String[] input;
		int i, j;
		BigInteger N;
		BigInteger zero = new BigInteger("0");
		BigInteger sum = new BigInteger("0");
		int ans = 0;
		
		buf = br.readLine();
		N = new BigInteger(buf);
		
		
		
		while(N.compareTo(zero) > 0) {
			//System.out.println("now: " + N.toString());
			N = N.subtract(new BigInteger(maxValue(buf)));
			//System.out.println("sub: " + maxValue(buf));
			if(maxValue(buf).equals("0")) break;
			sum = sum.add(new BigInteger(maxValue(buf)));
			buf = N.toString();
			ans++;
		}
		//System.out.println(sum.toString());
		System.out.println(ans);
		
	}
	
	static String maxValue(String s) {
		int i;
		int len = s.length();
		int check_len = 0;
		char max = '0';
		boolean f = false;
		StringBuilder ret = new StringBuilder(len + 1);
		for(i=0;i<len-1;i++) {
			if(f) {
				ret.append('9');
			} else if(s.charAt(i) <= s.charAt(i+1)) {
				ret.append(s.charAt(i));
			} else {
				f = true;
				if(i != 0 || s.charAt(i) != '1') {
					ret.append((char)(s.charAt(i) - 1));
					max = (char)(s.charAt(i) - 1);
					check_len = i;
				}
			}
		}
		if(f) {
			ret.append('9');
			for(i=0;i<check_len;i++) {
				if((int)ret.charAt(i) > (int)max) {
					ret.setCharAt(i, max);
				}
			}
			while(ret.length() > 1 && ret.charAt(0) == '0') {
				ret.deleteCharAt(0);
			}
		} else {
			ret.append(s.charAt(i));
		}
		return ret.toString();
	}
}

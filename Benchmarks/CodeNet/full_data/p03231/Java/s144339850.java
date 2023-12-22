import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		try{
			InputStreamReader isr =new InputStreamReader(System.in);
	   		BufferedReader br =new BufferedReader(isr);
	        String buf = br.readLine();
	        StringTokenizer st = new StringTokenizer(buf," ");
	    	final int n = Integer.parseInt(st.nextToken());
	        final int m = Integer.parseInt(st.nextToken());
	        if (n < 1 || m < 1 || m > 100000 || m > 100000) {
	        	throw new IllegalArgumentException();
	        }
	        String s = br.readLine();
	        String t = br.readLine();
	        if (s.length() != n || t.length() != m) {
	        	throw new IllegalArgumentException();
	        }
	        // a: n, m のどちらでも割り切れる最小の数(最小公倍数)
	        int a = -1;
	        int i = 1;
	        while (i != Integer.MAX_VALUE) {
	        	if (i % n == 0 && i % m == 0) {
	        		a = i;
	        		break;
	        	}
	        	i++;
	        }
	        if (a == -1) {
	        	throw new IllegalArgumentException();
	        }
	        i = a;
	        while (i < Integer.MAX_VALUE - a) {
	        	if (isExistGoodString()) {
	        		System.out.println(i);
	        		break;
	        	}
	        	i += a;
	        }
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} catch (IllegalArgumentException iae) {
			iae.printStackTrace();
			System.err.println("1 ≦ N, M ≦ 10^5 を満たす必要があります。");
		}
	}

	private static boolean isExistGoodString() {
		return true;
	}
}
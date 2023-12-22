import java.util.*;
import java.math.*;
import java.util.Scanner;
import java.math.BigInteger;
   
public class Main {
	static final long mod = (int)(1e9+7);
	static final int inf=(int)(1e9);
	static final int maxn=(int)(1e5+10);
	static long ksm(long a,long b) {
		long ret=1;
		while(b!=0) {
			if(b%2==1) {
				ret=ret*a%mod;
			}
			b>>=1;
			a=a*a%mod;
		}
		return ret;
	}
	public static void main(String[] args) {
    	Scanner cin=new Scanner(System.in);
    	String c=cin.next();
    	if(c.compareTo("A")==0) {
    		System.out.println("T");
    	}else if(c.compareTo("T")==0) {
    		System.out.println("A");
    	}else if(c.compareTo("G")==0) {
    		System.out.println("C");
    	}else {
    		System.out.println("G");
    	}
    }
}


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;



public class Main{
	
	//最大公約数・最小公倍数（セットで使う）
	public static long gcm(long a, long b) {
		long result = a;
		long k = 0;
		long n = b;
		do {
			k = result % n;
			result = n;
			n = k;
		} while(k != 0);
		return result;
	}
	
	public static long lcm(long a, long b) {
		long g;
		g = gcm(a, b);
		return a/g*b;
	}
	
	static long gcd (long a, long b) {
		long temp;
		while((temp = a%b)!=0) {
			a = b;
			b = temp;
		}
		return b;
	}
	
	//等差数列
	static long tousasum(int n) {
		return n*(n+1)/2;
	}



	//素数判定
	static boolean isPrime (int n) {
		if (n==2) return true;
		if (n<2 || n%2==0) return false;
		double d = Math.sqrt(n);
		for (int i=3; i<=d; i+=2) if(n%i==0){return false;}
		return true;
	}


	//倍数判定（10進数以外のときに有用）
	static boolean isMultiple (String s, int base, int m) {
		int temp = 0;
		for (int i=0; i<s.length(); i++) {
			temp = (temp*base+Character.getNumericValue(s.charAt(i)))%m;
		}
		if (temp==0) {return true;}
		return false;
	}


	//階乗
	static long factorial (int i) {
		if (i==1) {return 1;}
		else {return i*factorial(i-1);}
	}


	//進数変換
	static String toNbase (String sm, int m, int n) {
		return Long.toString(Long.parseLong(sm,m),n);
	}
	
	public static final long gcd_n(long[] param) {
	    final int len = param.length;
	    long g = gcd(param[0], param[1]);    //gcd(a, b) は以前作ったもの
	    for (int i = 1; i < len - 1; i++) {
	        g = gcd(g, param[i + 1]);       //gcd(a, b) は以前作ったもの
	    }
	    return g;
	}
	
	public static long lcm_n(long[] numbers) {
		long l;
		l = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			l = lcm(l, numbers[i]);
		}
		return l;
	}
	
	
 public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 int N=sc.nextInt();
	 String[] s=new String[N];
	 Map<String,Integer> mp=new HashMap();
	 for(int i=0;i<N;i++) {
		 String temp=sc.next();
		 char[] tmp=temp.toCharArray();
		 Arrays.sort(tmp);
		 s[i]=String.valueOf(tmp);
		 if(mp.containsKey(s[i])) {
			 mp.put(s[i],mp.get(s[i])+1);
		 }else {
			 mp.put(s[i],0);
		 }
		 
		 
	 }
	 long result = 0;
	 
	 for(Integer val : mp.values()){
	     result+=tousasum(val);
	 }
	 
	 System.out.println(result);
	 
	 
	 
	
	 

	 
	 
	 
	 
	 
	 
	
	 
	 
	 
 }
	


}



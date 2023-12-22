
import java.util.*;
import java.util.Map.Entry;
 
 
 
public class Main{
	
	public int num;
	public int vol;
 
	
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
		return (long)n*((long)n+1)/2;
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
	 int[] a=new int[8];
	 int pro=0;
	 int min=0;
	 int max=0;
	 for(int i=0;i<N;i++) {
		 int temp=sc.nextInt();
		 
		 if(temp<=399) {
			 a[0]++;
		 }else if(temp>=400&&temp<=799) {
			 a[1]++;
		 }else if(temp>=800&&temp<=1199) {
			 a[2]++;
		 }else if(temp>=1200&&temp<=1599) {
			 a[3]++;
		 }else if(temp>=1600&&temp<=1999) {
			 a[4]++;
		 }else if(temp>=2000&&temp<=2399) {
			 a[5]++;
		 }else if(temp>=2400&&temp<=2799) {
			 a[6]++;
		 }else if(temp>=2800&&temp<=3199) {
			 a[7]++;
		 }else if(temp>=3200){
			 pro++;
		 }
	 }
	 
	 
	 
	 for(int i=0;i<8;i++) {
		 if(a[i]!=0) {
			 min++;
		 }
	 }
	 max = min+pro;
	 
	 if(min==0) {
		 min=1;
	 }
	
	 System.out.println(min+" "+max);
 }
	
 
 
}
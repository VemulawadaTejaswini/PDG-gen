import java.util.Scanner;
public class Main {
	static Scanner scan=new Scanner(System.in);
	static int gcd (int a, int b) {return b>0?gcd(b,a%b):a;}
	static long lcm (int a, int b) {return a*b/gcd(a,b);}
	static int max(int a,int b) {return a>b?a:b;}
	static int min(int a,int b) {return a<b?a:b;}
	static long factorial(int i) {return i==1?1:i*factorial(i-1);}
	static int lower_bound(int a[],int key) {
		int low=0,high=a.length;
		while(low<high) {
			int mid=((high-low)/2)+low;
			if(a[mid]<=key)low=mid+1;
			else high=mid;
		}
		return high;
		}
	static int upper_bound(int a[],int key) {
		int low=0,high=a.length;
		while(low<high) {
			int mid=((high-low)/2)+low;
			if(a[mid]<key)low=mid+1;
			else high=mid;
		}
		return high;
		}
	static boolean isPrime (int n) {
		if (n==2) return true;
		if (n<2 || n%2==0) return false;
		double d = Math.sqrt(n);
		for (int i=3; i<=d; i+=2)if(n%i==0){return false;}
		return true;
	}
	static int upper_division(int a,int b) {
		if(a%b==0) {
			return a/b;
		}
		else {
			return a/b+1;
		}
	}
	static long lupper_division(long a,long b) {
		if(a%b==0) {
			return a/b;
		}
		else {
			return a/b+1;
		}
	}
	static long lmax(long a,long b) {return Math.max(a, b);}
	static long lmin(long a,long b) {return Math.min(a, b);}
	
		public static void main(String[] args) {
			int a[]=new int[26];
			for(int j=0;j<26;j++) {
				a[j]=100;
			}
			int b=scan.nextInt();
			for(int i=0;i<b;i++) {
				String str=scan.next();
				int z[]=new int[26];
				for(int j=0;j<str.length();j++) {
					char ch=str.charAt(j);
					z[ch-'a']++;
				}
				for(int j=0;j<26;j++) {
					a[j]=min(a[j],z[j]);
				}
				
			}
			for(int i=0;i<26;i++) {
				for(int j=0;j<a[i];j++) {
					char ch=(char)((char)'a'+i);
					System.out.print(ch);
				}
			}
			System.out.println();
		}
}

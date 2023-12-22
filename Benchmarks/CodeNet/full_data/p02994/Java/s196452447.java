import java.util.Scanner;
public class Main {
	
	static int gcd (int a, int b) {return b>0?gcd(b,a%b):a;}
	static int lcm (int a, int b) {return a*b/gcd(a,b);}
	public static int lower_bound(int vector[],int key){
		return 0;
	}
	public static int max(int a,int b) {
		if(a>b) {
			return a;
		}
		else {
			return b;
		}
	}
	public static int min(int a,int b) {
		if(a<b) {
			return a;
		}
		else {
			return b;
		}
	}
	public static boolean isPrime (int n) {
		if (n==2) return true;
		if (n<2 || n%2==0) return false;
		double d = Math.sqrt(n);
		for (int i=3; i<=d; i+=2) if(n%i==0){return false;}
		return true;
	}
	public static long factorial (int i) {//階乗
		if (i==1) {return 1;}
		else {return i*factorial(i-1);}
	}
	public static void main(String[] args){
	Scanner scan=new Scanner(System.in);
	int a=scan.nextInt();
	int b=scan.nextInt();
	int moto=(b+a+b-1)*a/2;
	int min=1145141929;
	for(int i=0,j=b;i<a;i++,j++) {
		int are=moto-j;
		min=min(Math.abs(are-moto),Math.abs(moto-min))==Math.abs(are-moto)?are:min;
	}
	System.out.println(min);
	}
}
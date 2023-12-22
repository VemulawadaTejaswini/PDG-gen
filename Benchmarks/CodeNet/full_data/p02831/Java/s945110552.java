import java.util.*;

class Main {

	static Scanner sc = new Scanner(System.in);	

	public static int gcd(int a,int b) {
		if(b==0) return a;
		else if(a<b) return gcd(b,a);
		else return gcd(b,a%b);
	}
	
	public static void main(String[] args) {
		int A = sc.nextInt(),B = sc.nextInt();
		System.out.println((A*B)/gcd(A,B));
	}
}
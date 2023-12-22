import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		long A=1;
		long B=1;
		for(int i=0; i<n; i++){
			long t=sc.nextLong();
			long a=sc.nextLong();
			long x=Math.max((A+t-1)/t,(B+a-1)/a);
			A=t*x;
			B=a*x;
		}
		System.out.println(A+B);
	}
}

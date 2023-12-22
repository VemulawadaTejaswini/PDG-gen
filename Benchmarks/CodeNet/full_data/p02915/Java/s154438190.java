import java.util.Scanner;
public class first {
	static long coinchange(long n)
	{
		return (long) Math.pow(n, 3);
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		long  n,k;
		n=scan.nextInt();
		if(n==1) {
			System.out.print(1);
			return;
		}
		long s=coinchange(n);
		System.out.print(s);
		
}
}
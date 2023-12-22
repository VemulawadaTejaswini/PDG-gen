import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long m = sc.nextLong();
		long d = sc.nextLong();
		
		double tester = 1;
		double cas = (n-d)*2;
		if(d==0)cas=n-d;
		cas*=(m-1);
		cas/=n;
		cas/=n;
		System.out.println(cas);
		System.out.printf("%.12f", cas);
	}

}

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long a=sc.nextLong();
		long b=sc.nextLong();
		
		if((2*b)>=a) {
			System.out.println(0);
		}
		else {
			long d=a%(2*b);
			System.out.println(d);
		}
	}
}

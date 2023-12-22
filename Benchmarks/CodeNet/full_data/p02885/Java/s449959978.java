import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long a=sc.nextLong();
		long b=sc.nextLong();
		long c = 2*b;
		
		if(c>=a) {
			System.out.println(0);
		}
		else {
			System.out.println(a-c);
		}
	}
}

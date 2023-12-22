import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		long x=sc.nextInt();
		long y=sc.nextInt();
		if(y<x) {
			System.out.println(0);
		}
		System.out.println((int)Math.ceil((double)y/x));
	}
}

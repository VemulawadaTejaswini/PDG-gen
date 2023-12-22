import java.util.Scanner;

public class Main {
	public static void main(String[]args){
		Scanner scan  = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();	
		System.out.println(a==(b+c)||(a+b)==c||(a+c)==b?"YES":"NO");
		
	}

}
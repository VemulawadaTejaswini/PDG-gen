import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt(),b=scan.nextInt(),c=scan.nextInt();
		if(a+b>=c) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}}}
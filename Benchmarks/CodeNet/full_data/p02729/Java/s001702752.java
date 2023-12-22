import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		
		int x = (n*(n-1))/2;
		int y = (m*(m-1))/2;
		
		System.out.println(x+y);
	}
}
import java.util.Scanner;

public class Main {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n >= 3 * 5 * 13)System.out.println(3);
		else if(n >= 3 * 5 * 11)System.out.println(2);
		else if(n >= 3 * 5 * 7)System.out.println(1);
		else System.out.println(0);
	}
	
}
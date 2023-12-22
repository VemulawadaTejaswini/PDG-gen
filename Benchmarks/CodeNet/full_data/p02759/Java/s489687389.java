import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)) {
			
			int n = sc.nextInt();
			
			int p = n % 2 == 0 ? n /2 : n /2 + 1;
			
			System.out.println(p);
			
		}
	}
}
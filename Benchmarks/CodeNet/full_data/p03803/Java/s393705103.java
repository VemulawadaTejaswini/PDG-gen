import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = (sc.nextInt() + 13) % 15;
		int b = (sc.nextInt() + 13) % 15;
		
		System.out.println(a > b ? "Alice" : a < b ? "Bob" : "Draw");
		
		sc.close();
	}
}


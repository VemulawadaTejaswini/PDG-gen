import java.util.Scanner;

public class Maic {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt()-1	;
		int b = scanner.nextInt()-1;
		
		int ans = a*b;
		System.out.println(ans);
		
		scanner.close();
	}

}

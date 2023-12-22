import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// aの入力
		int a = sc.nextInt();
		
		// sの入力
		String s = sc.next();
		
		if (a >= 3200) {
			System.out.println(s);
		}
		else {
			System.out.println("red");
		}
		
		sc.close();
	}

}

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		if(isEven(a*b)){
			System.out.println("Even");
			return;
		}
		System.out.println("Odd");
	}

	private static boolean isEven(int a) {
		return a % 2 == 0;
	}

}

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int A, B, res;

		A = scanner.nextInt();
		B = scanner.nextInt();

		scanner.close();
		
		res = A*B;
		
		if(res%2 == 0){
			System.out.println("No");
		}else{
			System.out.println("Yes");
		}
	}
}

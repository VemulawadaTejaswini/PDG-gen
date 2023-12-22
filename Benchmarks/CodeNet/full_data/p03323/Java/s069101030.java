import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		int A = scan.nextInt();
		int B = scan.nextInt();

		if (A <= 8 && B <= 8){
			System.out.println("Yay!");
		}else {
			System.out.println(":(");
		}

	}
}
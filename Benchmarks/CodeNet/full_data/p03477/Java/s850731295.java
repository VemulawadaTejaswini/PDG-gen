import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt(),B = sc.nextInt(),C = sc.nextInt(),D = sc.nextInt();
		int left = A + B,right = C + D;

		if(left > right) {
			System.out.println("Left");
		}else if(left < right) {
			System.out.println("Right");
		}else {
			System.out.println("Balanced");
		}
	}
}

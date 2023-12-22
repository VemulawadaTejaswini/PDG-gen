import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int day = sc.nextInt();

		System.out.print("Christmas");
		for(int i = 0; i < (25 - day); i ++) {
			System.out.print(" Eve");
		}
		System.out.println();
	}
}
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String topping = sc.nextLine();
		String[] order = topping.split("");
		int count = 0;

		for(int i=0; i<3; i++) {
			if(order[i].equals("○")) {
				count += 100;
			}
		}
		System.out.println(count+700);

	}
}

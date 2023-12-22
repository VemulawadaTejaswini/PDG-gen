import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		int[] num = {64, 32, 16, 8, 4, 2, 1};
		
		for (int i = 0; i < 7; i++) {
			if (n >= num[i]) {
				System.out.println(num[i]);
				break;
			}
		}
		sc.close();
	}
}
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		int a = sc.nextInt();
		int max = -99999;
		int min = 9999999;
		for(int i = 0; i < a; i++) {
			int input = Integer.parseInt(sc.next());
			if(input > max) {
				max = input;
			}
			if(input < min) {
				min = input;
			}
		}
		System.out.println(max - min);
	}
}
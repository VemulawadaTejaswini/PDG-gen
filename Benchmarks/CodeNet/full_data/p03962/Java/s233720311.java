import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		int count = 0;

		if (a == b) {
			count++;
		} else if (a == c) {
			count++;
		} else if (b == c) {
			count++;
		}

		if (count == 0) {
			System.out.println(3);
		} else if (0 < count && count < 3) {
			System.out.println(3 - count);
		} else if(count==3){
			System.out.println(1);
		}
	}
}
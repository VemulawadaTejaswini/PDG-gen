import java.util.Scanner;
import java.util.Arrays;

class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int n = 0;
		for(int i = 0; i <= a; i++){
			n += i;
		}
		System.out.println(n);
		in.close();

	}

}
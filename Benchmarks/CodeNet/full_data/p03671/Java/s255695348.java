import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] values = new int [3];
		for (int i = 0; i < 3; i++) {
			values[i] = sc.nextInt();
		}
		Arrays.sort(values);
		int val = values[0] + values[1];
		System.out.println(val);
	}

}

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int[] numArr = new int[3];

		for (int i = 0; i < 3; i++) {
			numArr[i] = s.nextInt();
		}
		int K = s.nextInt();

		Arrays.sort(numArr);
System.out.println(numArr[2]*2*K+numArr[1]+numArr[0]);
	}

}

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		int Num;

		Scanner sc = new Scanner(System.in);

		Num = sc.nextInt();

		int[] NumArray = new int[Num];

		for (int i = 0; i < Num; i++) {

			NumArray[i] = sc.nextInt();

		}

		int count = 0;

		for (int i = 1; i < NumArray.length; i++) {

			if (NumArray[i-1] < NumArray[i]) {

				++count;
				NumArray[i] = NumArray[i] -1;

			} else if (NumArray[i-1] == NumArray[i]) {

				++count;

			} else {
				break;
			}

		}

		if (count == NumArray.length -1) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}

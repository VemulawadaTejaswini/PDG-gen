import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = Integer.valueOf(sc.nextLine());
		int[] array = new int[count];
		for (int i = 0; i < count; i++) {
			array[i] = sc.nextInt();
		}
		sc.close();
		
		int[] resultArray = new int[count];
		for (int i = 0; i < count; i++) {
			int[] tempArray = new int[i + 1];
			resultArray[i] = array[i];
			for (int j = i; j >= 0; j--) {
				tempArray[i - j] = resultArray[j];
			}
			for (int j = 0; j < tempArray.length; j++) {
				resultArray[j] = tempArray[j];
			}
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < count; i++) {
			sb.append(resultArray[i]);
			if (i != count - 1) {
				sb.append(" ");
			}
		}
		System.out.println(sb.toString());
	}
}
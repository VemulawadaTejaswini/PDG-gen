import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		int[] input = new int[9];
		String k = "No";
		for (int i = 0; i < 9; i++) {
			input[i] = kb.nextInt();
		}
		int n = kb.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			int j = kb.nextInt();
			a[i] = j;
		}
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < n; j++) {
				if (input[i] == a[j]) {
					input[i] = 0;
					break;
				}
			}
		}
		if (input[0] == 0 && input[1] == 0 && input[2] == 0)
			k = "Yes";
		else if (input[3] == 0 && input[4] == 0 && input[5] == 0)
			k = "Yes";
		else if (input[6] == 0 && input[7] == 0 && input[8] == 0)
			k = "Yes";
		else if (input[0] == 0 && input[3] == 0 && input[6] == 0)
			k = "Yes";
		else if (input[1] == 0 && input[4] == 0 && input[7] == 0)
			k = "Yes";
		else if (input[2] == 0 && input[5] == 0 && input[8] == 0)
			k = "Yes";
		else if (input[0] == 0 && input[4] == 0 && input[8] == 0)
			k = "Yes";
		else if (input[2] == 0 && input[4] == 0 && input[6] == 0)
			k = "Yes";
		System.out.println(k);
		kb.close();
	}

}

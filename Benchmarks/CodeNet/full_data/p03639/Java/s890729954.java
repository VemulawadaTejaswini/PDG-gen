import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int N = reader.nextInt();
		String ans = "No";
		int[] all = new int[3];
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = reader.nextInt();
			int tmp = arr[i];
			for (int j = 1; j < 4; j++) {
				if (tmp % (2*j) != 0 || j == 3) {
					all[j-1]++;
					break;
				}
			}
		}
		if (arr.length == 1) {
			if (arr[0] % 4 == 0 ) {
				ans = "Yes";
			} 
			System.out.println(ans);
			reader.close();
			return;
		}
		if (all[2] >= (all[0] + all[1] - 1)) {
			ans = "Yes";
		}
		if ((all[2] + all[1]/2) >= (all[0] +  all[1]%2)) {
			ans = "Yes";
		}

		System.out.println(ans);
		reader.close();

	}
}




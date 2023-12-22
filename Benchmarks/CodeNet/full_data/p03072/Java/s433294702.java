import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int N = reader.nextInt();
		int ans = 1;
		int[] arr = new int[N];
		arr[0] = reader.nextInt();
		for (int i = 1; i < N; i++) {
			arr[i] = reader.nextInt();
			boolean flag = true;
			for (int j = 0; j < i;j++) {
				flag = flag && arr[j] <= arr[i];
			}
			if (flag) {
				ans++;
			}
		}


		System.out.println(ans);
		reader.close();

	}

}




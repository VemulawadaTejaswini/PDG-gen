import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] data = new int[N];
		for (int i = 0; i < N; i++) {
			int a = sc.nextInt();
			data[i] = a;
		}
		for (int i = 0; i < (N - 1); i++) {
			for (int k = 0; k < (N - 1); k++) {
				if (data[k] > data[k + 1]) {
					int x = data[k];
					data[k] = data[k + 1];
					data[k + 1] = x;
				}
			}
		}
		/*for(int i = 0; i < N; i++) { //デバッグ用
			System.out.println(i + " " + data[i]);
		}*/
		int cnt = 1;
		for(int i = 0; i < (N - 1); i++) {
			if(data[i] != data[i + 1]) {
				cnt++;
			}
		}
		System.out.println(cnt);
		sc.close();
	}

}

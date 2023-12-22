import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			int a = Integer.parseInt(br.readLine());
			int b = Integer.parseInt(br.readLine());
			int c = Integer.parseInt(br.readLine());
			int x = Integer.parseInt(br.readLine());
			int answer = 0;

			for (int i = 0; i < a + 1; i++) {
				for (int j = 0; j < b + 1; j++) {
					for (int  k = 0;  k < c + 1;  k++) {

						int sum = 500*i + 100*j + 50*k;
						if (sum == x) {
							answer++;
						}
					}
				}
			}
			System.out.println(answer);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
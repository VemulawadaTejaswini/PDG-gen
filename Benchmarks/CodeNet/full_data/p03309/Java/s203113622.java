import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {

			int n = Integer.parseInt(br.readLine());
			String[] str = br.readLine().split(" ");
			int[] a = new int[n];
			int sad = 0;
			for (int i = 0; i < n; i++) {
				a[i] = Integer.parseInt(str[i]);
				sad += Math.abs(a[i] - (i + 1));
			}
			System.out.println(sad);

		} catch (IOException e) {

		}
	}

}

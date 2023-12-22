import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        in.close();
 
		for (int a = 1; a < 10; a++) {
			for (int b = 1; b < 10; b++) {
				if (a * b == n) {
					System.out.println("Yes");
					return;
				}
			}
		}
		System.out.println("No");
	}
}
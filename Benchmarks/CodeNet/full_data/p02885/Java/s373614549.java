import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String sa = br.readLine();
		String sb = br.readLine();

		int a = Integer.parseInt(sa);
		int b = Integer.parseInt(sb);

		int c=(a - b * 2);

		if (c<0) {
			System.out.println(0);
		} else {
			System.out.println(c);
		}
	}
}
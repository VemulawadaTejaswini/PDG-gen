import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Throwable {
		MyScanner sc = new MyScanner();
		String s = sc.nextString();

		switch (s) {
		case "Sunny":
			System.out.println("Cloudy");
			break;
		case "Cloudy":
			System.out.println("Rainy");
			break;
		case "Rainy":
			System.out.println("Sunny");
			break;
		default:
			break;
		}
	}

	static class MyScanner {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		public String nextString() throws IOException {
			return br.readLine();
		}

		public int nextInt() throws NumberFormatException, IOException {
			return Integer.parseInt(nextString());
		}

		public String[] nextStringArr() throws IOException {
			return nextString().split(" ");
		}

		public Integer[] nextIntArr() throws IOException {
			String[] strArr = nextStringArr();
			Integer[] intArr = new Integer[strArr.length];
			for (int i = 0; i < strArr.length; i++) {
				intArr[i] = Integer.parseInt(strArr[i]);
			}
			return intArr;
		}
	}

}

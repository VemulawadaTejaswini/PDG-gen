import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String str = reader.readLine();
		int N = Integer.parseInt(str);
		double min_dbl = N / 1.08;
		int min = (int)Math.floor(min_dbl);
		int max = (int)Math.floor((N+1) / 1.08);
		if (min != max) {
			System.out.println(max);
		}
		else if (min_dbl - min < 0.001) {
			System.out.println(min);
		}
		else if (0.999 < min_dbl - min) {
			System.out.println(min + 1);
		}
		else {
			System.out.println(":(");
		}
		
	}
}
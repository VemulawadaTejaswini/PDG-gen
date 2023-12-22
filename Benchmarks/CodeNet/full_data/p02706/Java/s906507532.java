import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line1 = br.readLine();
		String line2 = br.readLine();
		int days = Integer.parseInt(line1.split(" ")[0]);
		int homeworks = Integer.parseInt(line1.split(" ")[1]);
		String[] costs = line2.split(" ");
		int sum = 0;
		for(int i = 0; i < homeworks; i++) {
			sum += Integer.parseInt(costs[i]);
		}
		System.out.println(Math.max(days - sum, -1));
	}
}

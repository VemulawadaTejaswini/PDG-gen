import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] nums = br.readLine().split(" ");
		int d = Integer.parseInt(nums[0]);
		int n = Integer.parseInt(nums[1]);

		System.out.println((int) Math.pow(100, d) * (n == 100 ? n + 1 : n));

	}

}

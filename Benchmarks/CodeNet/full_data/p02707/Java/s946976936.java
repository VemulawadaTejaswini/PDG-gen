import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line1 = br.readLine();
		String line2 = br.readLine();
		int counts = Integer.parseInt(line1);
		int[] bossCount = new int[counts];
		String[] bosses = line2.split(" ");
		for(int i = 0; i < counts; i++) {
			bossCount[i] = 0;
		}
		for(int i = 0; i < bosses.length; i++) {
			int index = Integer.parseInt(bosses[i]);
			bossCount[index - 1] += 1;
		}
		for (int i : bossCount) {
			System.out.println(i);
		}
	}
}

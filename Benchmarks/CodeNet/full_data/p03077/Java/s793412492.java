import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static Main m;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		long people = Long.valueOf(in.readLine());
		long[] capacity = new long[5];
		for(int i = 0; i < 5; i++) {
			capacity[i] = Long.valueOf(in.readLine());
		}
		long compare = Long.MAX_VALUE;
		for(int i = 0; i < 5; i++) {
			if(capacity[i] < compare) {
				compare = capacity[i];
			}
		}
		long time = (long) Math.ceil(people/compare);
		time += 5;
		System.out.println(Long.toUnsignedString(time));
	}
}

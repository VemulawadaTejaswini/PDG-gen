import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		new Main().run();
		
	}
	
	private static void run() throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(reader.readLine());
		int[] list = new int[2 * N];
		int sum = 0;
		
		String str = reader.readLine();
		int index1 = -1;
		int index2 = -1;
		
		for (int i = 0; i < 2 * N; ++i) {
			index2 = str.indexOf(" ", index1 + 1);
			if (index2 == -1) {
				index2 = str.length();
			}
			
			list[i] = Integer.parseInt(str.substring(index1 + 1, index2));
			// System.out.println(list[i]);
			
			index1 = index2;
			
		}
		
		Arrays.sort(list);
		
		for (int i = 0; i < 2 * N; i += 2) {
			sum += list[i];
			
		}
		
		System.out.println(sum);
		
	}
}

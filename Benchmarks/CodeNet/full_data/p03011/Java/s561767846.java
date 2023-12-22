
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws Exception {
		String line = readLine();
		String[] str = line.split(" ");
		int[] array = new int[str.length];
		for(int i = 0; i < 3; i++) {
			array[i] = Integer.parseInt(str[i]);
		}
		Arrays.sort(array);
		System.out.println(array[0]+array[1]);
	}


	private static String readLine() throws Exception {
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		return br.readLine();
	}
}

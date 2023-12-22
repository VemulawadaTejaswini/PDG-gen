import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		String len_s = readLine();
		int len = Integer.parseInt(len_s);
		
		String line = readLine();
		String str[] = line.split(" ");
		
		int[] array = new int[str.length];
		
		for(int i = 0; i < 3; i++) {
			array[i] = Integer.parseInt(str[i]);
		}
		
		int sum = 0;
		for(int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		
		int lat = sum;
		int answer = 0;
		int tmp = 0;
		
		for(int i = 0; i < (array.length - 1); i++) {
			tmp = Math.abs(array[i]-(lat-array[i]));
			if(answer == 0 || tmp<answer) {
				answer = tmp;
			}
		}
		
		System.out.println(answer);
	}


	private static String readLine() throws Exception {
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		return br.readLine();
	}
}

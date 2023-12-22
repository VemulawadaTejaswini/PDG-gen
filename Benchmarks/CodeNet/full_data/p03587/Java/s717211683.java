import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		String str = br.readLine();
		int sum = 0;
			for(int i = 0 ; i < str.length() ; i++){
				sum += str.charAt(i) == '1' ? 1 : 0;
			}
			System.out.println(sum);
			
	}
}

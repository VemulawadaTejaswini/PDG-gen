import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String str = reader.readLine();
		int N = Integer.parseInt(str);
		char[] ary = reader.readLine().toCharArray();
		
		char[] alphabet = new char[26];
		char c = 'A';
		for (int i = 0; i < 26; i++) {
			alphabet[i] = c++;
		}
		
		for (int i = 0; i < ary.length; i++) {
			int a = (int)ary[i] - (int)'A';
			a += N;
			a %= 26;
			System.out.print(alphabet[a]);
		}
		System.out.println();
	}
}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[]args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] a = br.readLine().split(" ");
		int N = Integer.parseInt(a[0]);
		int L = Integer.parseInt(a[1]);
		String[] words = new String[N];
		for(int i = 0 ; i < N ; i ++) {
			words[i] = br.readLine();
		}
		Arrays.sort(words);
		for(int i = 0 ; i < N ; i++) {
			System.out.print(words[i]);
		}
	}
	

}
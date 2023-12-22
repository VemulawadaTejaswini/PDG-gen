import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = 0;
		try {
			n = Integer.parseInt(br.readLine());
		} catch (IOException e) {
			e.getStackTrace();
		}
		
		double v[] = new double [n];
		String str[] = new String [n];
		String line;
		try {
			line = br.readLine();
			str = line.split(" ");
			for (int i = 0; i < n; i++) {
				v[i] = Integer.parseInt(str[i]);
			}
		} catch (IOException e) {
			e.getStackTrace();
		}
		
		Arrays.sort(v);
		
		for(int i = 0; i < n - 1; i++) {
			v[i+1] = (v[i] + v[i+1]) / 2.0;
		}
		
		System.out.println(v[n-1]);
		
	}
}
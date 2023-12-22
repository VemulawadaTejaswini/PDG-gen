import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); 
		String s = bf.readLine();
		long suma = 0L;
		int bs = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'B')
				bs++;
			else
				suma += bs;
		}
		System.out.println(suma);
	}
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int cnt = 0;
		for(int i=0;i<line.length();i++) {
			char c = line.charAt(i);
			if(c == '1') cnt++;
		}
		System.out.println(cnt);
	}
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		int n = 0;
		try {
			line = br.readLine();
			n = Integer.parseInt(line);
		} catch (IOException e) {
			e.getStackTrace();
		}
		int p[] = new int [n];
		String in[] = new String [n];
		try {
			line = br.readLine();
			in = line.split(" ");
		} catch (IOException e) {
			e.getStackTrace();
		}
		int count = 0;
		for(int i = 0; i < n; i++) {
			p[i] =  Integer.parseInt(in[i]);
			if(p[i] != i+1) count++;
		}
		
		if(count <= 2) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
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
		
		int a[] = new int [n+1];
		int b[] = new int [n];
		String in_a[] = new String [n+1];
		String in_b[] = new String [n];
		try {
			line = br.readLine();
			in_a = line.split(" ");
			line = br.readLine();
			in_b = line.split(" ");
			
			for (int i = 0; i < n; i++) {
				a[i] =  Integer.parseInt(in_a[i]);
				b[i] =  Integer.parseInt(in_b[i]);
			}
			a[n] =  Integer.parseInt(in_a[n]);
		} catch (IOException e) {
			e.getStackTrace();
		}
		
		int sum = 0;
		for (int i = 0; i < n; i++) {
			if(a[i] < b[i]) {
				sum += a[i];
				b[i] -= a[i];
				if(a[i+1] < b[i]) {
					sum += a[i+1];
					a[i+1] = 0;
				} else {
					sum += b[i];
					a[i+1] -= b[i];
				}
			} else {
				sum += b[i];
			}
		}
		
		System.out.println(sum);
	}
}
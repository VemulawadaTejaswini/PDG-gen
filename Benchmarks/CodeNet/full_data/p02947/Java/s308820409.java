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
		
		String s[] = new String[n];
		for (int i = 0; i < n; i++) {
			try {
				s[i] = br.readLine();
			} catch (IOException e) {
				e.getStackTrace();
			}
		}
		
		int count = 0;
		for(int i = 0; i < n; i++) {
			int s_i[] = new int [256];
			LOOP1 : for(int j = i; j < n; j++) {
				if(i != j) {
					for (int k = 0; k < 10; k++) {
						s_i[s[i].charAt(k)]++;
					}
					
					for(int k = 0; k < 10; k++) {
						if(--s_i[s[j].charAt(k)] < 0) {
							continue LOOP1;
						}
					}
					count++;
				}
			}
		}
		
		System.out.println(count);
	}
}
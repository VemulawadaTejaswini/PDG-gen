import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		int n = 0;
		String str = null;
		
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			n = Integer.parseInt(br.readLine());
			str = br.readLine();
		} catch (IOException e) {
			return;
		}
		
		int max = 0;
		for (int i = 1; i < n - 1; i++) {
			String x = str.substring(0, i);
			String y = str.substring(i, n);
			
			int tmp = 0;
			if (x.length() < y.length()) {
				for (int j = 0; j < x.length(); j++) {
					if (x.indexOf(x.charAt(j)) == j &&
						y.indexOf(x.charAt(j)) >= 0) {
						tmp++;
					}
				}
			} else {
				for (int j = 0; j < y.length(); j++) {
					if (y.indexOf(y.charAt(j)) == j &&
					x.indexOf(y.charAt(j)) >= 0) {
						tmp++;
					}
				}
			}
			
			if (tmp > max) max = tmp;
		}
		
		System.out.println(max);
	}
}

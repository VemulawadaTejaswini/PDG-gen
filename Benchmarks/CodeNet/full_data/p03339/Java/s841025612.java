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
		
		int min = Integer.MAX_VALUE;
		
		for (int i = 0; i < n; i++) {
			int tmp = 0;
			
			for (int j = 0; j < n; j++) {
				if ((j < i && str.charAt(j) == 'W') ||
					(j > i && str.charAt(j) == 'E')) {
						tmp++;
				}
			}
			
			if (tmp < min) {
				min = tmp;
			}
		}
		
		System.out.println(min);
	}
}

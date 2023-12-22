import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		String[] strs = read(1);
		
		int n = Integer.parseInt(strs[0]);
		
		int count = 0;
		
		for (int i = 1; i <= n; i += 2) {
			int tmp = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					tmp++;
				}
			}
			
			if (tmp == 8) {
				count++;
			}
		}
		
		System.out.println(count);
	}
	
	private static String[] read(int len) {
		List<String> strList = new ArrayList<>();
		
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			for (int i = 0; i < len; i++) {
				strList.add(br.readLine());
			}
		} catch (IOException e) {
		}
		
		return strList.toArray(new String[0]);
	}
}

import java.io.*;
import java.util.*;

public class Main {
	private static final int READ_COUNT = 2;
	private static List<String> strList = new ArrayList<>();
	
	public static void main(String[] args) {
		read();
		
		int n = Integer.parseInt(strList.get(0).split(" ")[0]);
		int m = Integer.parseInt(strList.get(0).split(" ")[1]);
		int[] as = new int[n];
		String[] strs = strList.get(1).split(" ");
		for (int i = 0; i < n; i++) {
			as[i] = Integer.parseInt(strs[i]);
		}
		
		int cnt = 0;
		
		for (int i = n - 1; i >= 0; i--) {
			long sum = as[i];
			
			if (sum % m == 0) {
				cnt++;
			}
			
			for (int j = i - 1; j >= 0; j--) {
				sum += as[j];
				
				if (sum % m == 0) {
					cnt++;
				}
			}
		}
		
		System.out.println(cnt);
	}
	
	private static void read() {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			for (int i = 0; i < READ_COUNT; i++) {
				strList.add(br.readLine());
			}
		} catch (IOException e) {
		}
	}
}

import java.io.*;
import java.util.*;

public class Main {
	private static BufferedReader br = null;
	
	public static void main(String[] args) {
		String[] strs = read(1)[0].split(" ");
		int a = Integer.parseInt(strs[0]);
		int b = Integer.parseInt(strs[1]);
		
		String result = "No";
		
		for (int i = 1; i <= 3; i++) {
			if ((a * b * i) % 2 == 1) {
				result = "Yes";
				break;
			}
		}
		
		System.out.println(result);
		
		close();
	}
	
	private static String[] read(int len) {
		List<String> strList = new ArrayList<>();
		
		try {
			if (br == null) {
				br = new BufferedReader(new InputStreamReader(System.in));
			}
			
			for (int i = 0; i < len; i++) {
				strList.add(br.readLine());
			}
		} catch (IOException e) {
		}
		
		return strList.toArray(new String[0]);
	}
	
	private static void close() {
		try {
			if (br != null) {
				br.close();
			}
		} catch (IOException e) {
		}
	}
}

import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		String[] strs = read(1)[0].split(" ");
		
		int n = Integer.parseInt(strs[0]);
		int i = Integer.parseInt(strs[1]);
		
		System.out.println(n - i + 1);
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

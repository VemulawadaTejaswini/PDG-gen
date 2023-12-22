import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Main {
	private static BufferedReader br = null;
	
	public static void main(String[] args) {
		int n = Integer.parseInt(read(1)[0]);
		String[] w = read(n);
		
		String result = "Yes";
		
		Set<String> wSet = Arrays.stream(w).collect(Collectors.toSet());
		if (wSet.size() != w.length) {
			result = "No";
		} else {
			for (int i = 1; i < w.length; i++) {
				if (w[i - 1].charAt(w[i - 1].length() - 1) != w[i].charAt(0)) {
					result = "No";
				}
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

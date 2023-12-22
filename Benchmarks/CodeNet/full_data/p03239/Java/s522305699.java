import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Main {
	private static BufferedReader br = null;
	
	public static void main(String[] args) {
		String[] strs = read(1)[0].split(" ");
		int n = Integer.parseInt(strs[0]);
		int t = Integer.parseInt(strs[1]);
		
		strs = read(n);
		
		int minCost = Integer.MAX_VALUE;
		for (String str : strs) {
			String[] strs2 = str.split(" ");
			int c = Integer.parseInt(strs2[0]);
			int t2 = Integer.parseInt(strs2[1]);
			
			if (t2 <= t && c < minCost) {
				minCost = c;
			}
		}
		
		if (minCost == Integer.MAX_VALUE) {
			System.out.println("TLE");
		} else {
			System.out.println(minCost);
		}
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

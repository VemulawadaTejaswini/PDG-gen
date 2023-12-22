import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Main {
	private static BufferedReader br = null;
	
	public static void main(String[] args) {
		int n = Integer.parseInt(read(1)[0]);
		String[] strs = read(1)[0].split(" ");
		
		int count = 0;
		
		Map<String, Integer> map = new HashMap<>(strs.length / 2);
		for (int i = 0; i < strs.length; i += 2) {
			if (map.get(strs[i]) == null) {
				map.put(strs[i], 1);
				continue;
			}
			
			map.put(strs[i], map.get(strs[i]) + 1);
		}
		String maxKey = null;
		int max = 0;
		int sum = 0;
		for (String key : map.keySet()) {
			if (map.get(key) > max) {
				max = map.get(key);
				maxKey = key;
			}
			sum += map.get(key);
		}
		count += sum - max;
		
		map = new HashMap<>(strs.length / 2);
		for (int i = 1; i < strs.length; i += 2) {
			if (map.get(strs[i]) == null) {
				map.put(strs[i], 1);
				continue;
			}
			
			map.put(strs[i], map.get(strs[i]) + 1);
		}
		maxKey = null;
		max = 0;
		sum = 0;
		for (String key : map.keySet()) {
			if (map.get(key) > max) {
				max = map.get(key);
				maxKey = key;
			}
			sum += map.get(key);
		}
		count += sum - max;
		
		if (count == 0 && strs[0].equals(strs[1])) {
			count = strs.length / 2;
		}
		
		System.out.println(count);
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

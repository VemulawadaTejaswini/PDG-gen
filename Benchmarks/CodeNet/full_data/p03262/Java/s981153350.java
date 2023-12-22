import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Main {
	private static BufferedReader br = null;
	
	public static void main(String[] args) {
		String[] strs = read(1)[0].split(" ");
		int n = Integer.parseInt(strs[0]);
		int x = Integer.parseInt(strs[1]);
		strs = read(1)[0].split(" ");
		List<Integer> xs = new ArrayList<>(n);
		for (int i = 0; i < n; i++) {
			xs.add(Integer.parseInt(strs[i]));
		}
		if (xs.indexOf(x) < 0) {
			xs.add(x);
		}
		
		Collections.sort(xs);
		
		int d = xs.get(1) - xs.get(0);
		for (int i = 2; i < n; i++) {
			int d2 = xs.get(i) - xs.get(i - 1);
			int tmp = 1;
			if (d2 > d) {
				while (d2 % (d / tmp) != 0) {
					tmp++;
				}
				d /= tmp;
			} else {
				while (d % (d2 / tmp) != 0) {
					tmp++;
				}
				d = d2 / tmp;
			}
		}
		
		System.out.println(d);
		
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

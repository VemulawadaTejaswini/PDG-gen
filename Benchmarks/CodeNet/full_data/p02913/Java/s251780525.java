import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String s = br.readLine();
		int a = 0, b = n;
		while(a+1 < b) {
			int c = (a+b)/2;
			if(check(c, s, n)) {
				a = c;
			}
			else {
				b = c;
			}
		}
		System.out.println(a);
	}
	static boolean check(int len, String s, int n) {
		HashMap<String, MinMax> map = new HashMap<>();
		for(int i = 0; i + len <= n; i++) {
			String t = s.substring(i, i+len);
			if(map.containsKey(t)) {
				map.get(t).add(i);
			}
			else {
				map.put(t, new MinMax(i));
			}
		}
		for(String t: map.keySet()) {
			MinMax p = map.get(t);
			if(p.min + len <= p.max) {
				return true;
			}
		}
		return false;
	}
	static class MinMax{
		int min, max;
		public MinMax(int k) {
			min = k; max = k;
		}
		public void add(int k) {
			if(k < min) min = k;
			if(k > max) max = k;
		}
		public String toString() {
			return min+"/"+max;
		}
	}

}

import java.io.*;
import java.util.*;


public class Main {
	
	static boolean found;
	static HashMap<String, Pair> memo;
	static Pair ans;
	
	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(System.in);
		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
		char[] str = f.readLine().toCharArray();
		memo = new HashMap<>();
		found = false;
		solve(str, 0, str.length-1);
		if(found) {
			System.out.println((ans.i+1) + " " + (ans.j+1));
		} else {
			System.out.println(-1 + " " + -1);
		}
	}
	
	static Pair solve(char[] str, int start, int end) {
		if(memo.containsKey(str)) return memo.get(str);
		if(found) return null;
		StringBuilder string = new StringBuilder();
		for(int i = start; i <= end; i++) string.append(str[i]);
		String use = string.toString();
		if(use.length() < 2) return null;
		int[] freq = new int[26];
		int max = 0;
		for(int i = 0; i < use.length(); i++) {
			freq[use.charAt(i)-'a']++;
			max = Math.max(max, freq[use.charAt(i)-'a']);
		}
		if(max > use.length()/2) {
			memo.put(use, new Pair(start, end));
			ans = new Pair(start, end);
			found = true;
		} else {
			solve(str, start+1, end); 
			solve(str, start, end-1);
		}
		return null;
	}
}

class Pair {
	int i, j;
	public Pair(int I, int J) { 
		i = I;
		j = J;
	}
}
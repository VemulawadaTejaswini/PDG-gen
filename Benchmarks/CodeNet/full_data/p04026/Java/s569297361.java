import java.io.*;
import java.util.*;


public class Main {
	
	static boolean found;
	static HashMap<String, Pair> memo;
	static Pair ans;
	
	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(System.in);
		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
		String str = f.readLine();
		memo = new HashMap<>();
		found = false;
		solve(str, 0);
		if(found) {
			System.out.println((ans.i+1) + " " + (ans.j+1));
		} else {
			System.out.println(-1 + " " + -1);
		}
	}
	
	static Pair solve(String str, int start) {
		if(memo.containsKey(str)) return memo.get(str);
		if(found) return null;
		if(str.length() < 2) return null;
		int[] freq = new int[26];
		int max = 0;
		for(int i = 0; i < str.length(); i++) {
			freq[str.charAt(i)-'a']++;
			max = Math.max(max, freq[str.charAt(i)-'a']);
		}
		if(max > str.length()/2) {
			memo.put(str, new Pair(start, start+str.length()));
			ans = new Pair(start, start+str.length()-1);
			found = true;
		} else {
			solve(str.substring(1), start+1); 
			solve(str.substring(0, str.length()-1), start);
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
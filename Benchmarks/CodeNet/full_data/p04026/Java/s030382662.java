import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
	 
	static final Scanner sc = new Scanner(System.in);
	static final PrintWriter out = new PrintWriter(System.out,false);
	static boolean debug = false;
 
	static void solve() {
		String str = sc.next();
		List<List<Integer>> pos = new ArrayList<List<Integer>>();
		for(int i=0; i<26; i++) {
			pos.add(new ArrayList<Integer>());
		}
		for(int i=0; i<str.length(); i++) {
			int c = str.charAt(i) - 'a';
			for(int j=pos.get(c).size()-1; j>=0; j--) {
				int range = i - pos.get(c).get(j) + 1;
				int count = pos.get(c).size() - j + 1;
				if(count>(range/2)) {
					out.println((pos.get(c).get(j)+1) + " " + (i+1));
					return;
				}
			}
			pos.get(c).add(i);
		}
		out.println("-1 -1");
	}
 
	public static void main(String[] args) {
		solve();

		out.flush();
		out.close();
	}
}
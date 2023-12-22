import java.util.*;
import java.io.*;

class Main {

	void solve () {

		HashMap<String, String> map = new HashMap<>();
		map.put("A", "T");
		map.put("T", "A");
		map.put("C", "G");
		map.put("G", "C");
		out.println(map.get(in.next()));
		
		
	}
	
	public static Scanner in = new Scanner(System.in);
	public static PrintWriter out = new PrintWriter(System.out);
	public static void main(String[] args) {
		new Main().solve();
		out.flush();
	}

}

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	static Scanner scanner;
	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    int N=gi();
	    Map<Integer, Integer> m=new HashMap<Integer, Integer>();

	    for(int i=0; i<N;i++) {
	    	int v=gi();
	    	if(m.containsKey(v)) {
	    		m.put(v, m.get(v)+1);
	    	} else {
	    		m.put(v, 1);
	    	}
	    }

	    int a=0;
	    for(Map.Entry<Integer, Integer> e : m.entrySet()) {
	    	int k=e.getKey();
	    	int v=e.getValue();
	    	if(v >= k) {
	    		a+=v-k;
	    	} else {
	    		a+=v;
	    	}
	    }
	    System.out.print(a);
	}

	// 文字列として入力を取得
	public static String gs() {
		return scanner.next();
	}

	// intとして入力を取得
	public static int gi() {
		return Integer.parseInt(scanner.next());
	}

	// longとして入力を取得
	public static long gl() {
		return Long.parseLong(scanner.next());
	}

	// doubleとして入力を取得
	public static double gd() {
		return Double.parseDouble(scanner.next());
	}
}
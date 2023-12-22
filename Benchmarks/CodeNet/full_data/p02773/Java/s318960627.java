import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

	static Scanner scanner;
	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    int N=gi();
	    String[] S = new String[N];
	    Map<String, Integer> m = new HashMap<String, Integer>();

	    int max = 1;
	    for (int i=0; i<N; i++) {
	    	S[i] = gs();
	    	if (m.containsKey(S[i])) {
	    		int n= m.get(S[i])+1;
	    		m.put(S[i], n);
	    		if (n>max) max=n;
	    	} else {
	    		m.put(S[i], 1);
	    	}
	    }
	    List<String> ss = new ArrayList<String>();
	    for (Map.Entry<String, Integer> entry : m.entrySet()) {
	    	if (entry.getValue() == max) {
	    		ss.add(entry.getKey());
	    	}
	    }

	    Collections.sort(ss);

	    for (int i=0; i<ss.size(); i++) {
	    	System.out.println(ss.get(i));
	    }
        //System.out.println(c);
//        if (X%Y==0) {
//        	System.out.print("-1");
//        }else{
//        	long c=1;
//        	while(true) {
//        		if (((X*c) %Y) != 0) {
//        			System.out.print(X*c);
//        			return;
//        		}
//        		c++;
//        	}
//        }


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
}
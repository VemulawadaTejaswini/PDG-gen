import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

	    Scanner sc = new Scanner(System.in);
	    int N = sc.nextInt();
	    String[] S = new String[N];
	    for (int i = 0; i < N; i++) {
	    	S[i] = sc.next();
	    }

	    int max = 0;
	    HashMap<String, Integer> map = new HashMap<>();
	    for ( int i = 0; i < N; i++) {
	    	Integer count = map.get(S[i]);
	    	if (count == null) {
	    		count = 1;
	    	} else {
	    		count++;
	    	}

	    	map.put(S[i], count);

	    	if (count > max) {
	    		max = count;
	    	}
	    }

	    ArrayList<String> list = new ArrayList<>();
	    for (Entry<String, Integer> entry : map.entrySet()) {
	    	if (entry.getValue() == max) {
	    		list.add(entry.getKey());
	    	}
	    }

	    Collections.sort(list);

	    for (String s : list) {
	    	System.out.println(s);
	    }

	}
}
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);

	    int N = Integer.parseInt(scanner.next());
	    String[] S  = new String[N];
	    Map<String, Integer> m=new HashMap<String, Integer>();

	    for (int i=0; i<N; i++) {
	        String s = scanner.next();
	        char[] cs= s.toCharArray();
	        Arrays.parallelSort(cs);
	        s = new String(cs);
	        if (m.containsKey(s)) {
	            int a = m.get(s);
	        	m.put(s, a+1);
	        } else {
	        	m.put(s, 1);
	        }
	    }

	    long r=0;
	    for(Map.Entry<String, Integer> entry : m.entrySet()){
	        r+= f(entry.getValue());
	    }

        System.out.print(r);
	}

	public static long f(int n) {
		if (n==1) {
			return 0;
		} else {
			return n-1 + f(n-1);
		}
	}

}
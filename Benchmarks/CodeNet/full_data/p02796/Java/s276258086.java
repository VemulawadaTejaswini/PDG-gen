
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	static Scanner scanner;
	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    int n=gi();
	    long[] x=new long[n];
	    long[] l=new long[n];
	    long[] ae=new long[n];
	    List<Pair<Long, Long>> li=new ArrayList<Pair<Long, Long>>();

	    for (int i=0; i<n;i++) {
	    	x[i]=gl();
	    	l[i]=gl();
	    	Pair<Long, Long> p=new Pair<Long,Long>(x[i]+l[i], x[i]-l[i]);
	    	li.add(p);
	    }

	    Collections.sort(li);
	    
	    int c=0;
	    long last=Long.MIN_VALUE;
	    for (int i=0; i< li.size();i++) {
	    	Pair<Long, Long> p= li.get(i);
	    	if (p.getValue()>=last) {
	    		last=p.getKey();
	    		c++;
	    	}
	    }

	    System.out.println(c);
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

	public static class Pair<K, V> extends AbstractMap.SimpleEntry<K, V> implements Comparable<Pair<K, V>>{
		/** serialVersionUID. */
	    private static final long serialVersionUID = 6411527075103472113L;

	    public Pair(final K key, final V value) {
	        super(key, value);
	    }

		@Override
		public int compareTo(Pair<K, V> o) {

			Comparable key = (Comparable)this.getKey();
			Comparable key2 = (Comparable)o.getKey();

			return key.compareTo(key2);
		}


	}
}

import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static Scanner scanner;

	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    int N=gi();
	    int C=gi();
	    int[][] D=new int[C][C];
	    int[][] c=new int[N][N];
	    for(int i=0;i<C;i++) {
	    	for(int j=0;j<C;j++) {
		    	D[i][j]=gi();
		    }
	    }

	    for(int i=0;i<N;i++) {
	    	for(int j=0;j<N;j++) {
		    	c[i][j]=gi()-1;
		    }
	    }

	    Pair<Integer,Integer>[][] ps=new Pair[3][C];
	    for(int i=0;i<3;i++) {
            for(int j=0;j<C;j++) {
            	int iwa=0;
            	for(int k=0;k<N;k++) {
            		for(int l=0;l<N;l++) {
        		    	if((k+l)%3==i) {
        		    		int col=c[k][l];
        		    		iwa+=D[col][j];
        		    	}
        		    }
    		    }
            	ps[i][j]=new Pair<Integer,Integer>(iwa, j);
		    }
            Arrays.parallelSort(ps[i]);
	    }

	    int ans=Integer.MAX_VALUE;
	    for(int i=0;i<3;i++) {
            for(int j=0;j<3;j++) {
            	for(int k=0;k<3;k++) {
                    Pair<Integer,Integer> p1=ps[0][i];
                    Pair<Integer,Integer> p2=ps[1][j];
                    Pair<Integer,Integer> p3=ps[2][k];
                    if(p1.getValue()==p2.getValue() || p2.getValue()==p3.getValue() || p3.getValue()==p1.getValue()) {
                    	continue;
                    }
                    ans=Math.min(ans, p1.getKey()+p2.getKey()+p3.getKey());
    		    }
		    }
	    }




	    System.out.println(ans);
	}

	public static class Pair<K, V> extends AbstractMap.SimpleEntry<K, V> implements Comparable<Pair<K, V>> {
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
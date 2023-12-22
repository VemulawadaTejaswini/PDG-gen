
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	static Scanner scanner;
	static long[][] d;
	static long min=Long.MAX_VALUE;

	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    int N=gi();
	    int M=gi();
	    int R=gi();
	    int[] rs=new int[R];
	    d=new long[N][N];
	    for (int i=0; i<N;i++) {
	    	for (int j=0; j<N;j++) {
	    		if(i==j) {
	    			d[i][j]=0;
	    		} else {
		    	    d[i][j]=Long.MAX_VALUE;
	    		}
		    }
	    }
	    for (int i=0; i<R;i++) {
	    	rs[i]=gi()-1;
	    }
	    for (int i=0; i<M;i++) {
	    	int a=gi()-1;
	    	int b=gi()-1;
	    	long c=gl();
	    	d[a][b]=c;
	    	d[b][a]=c;
	    }

	    for (int i=0; i<N; i++) {
	    	for (int j=0; j<N; j++) {
	    		for (int k=0; k<N; k++) {
	    			if (d[j][i]!=Long.MAX_VALUE && d[i][k]!=Long.MAX_VALUE) {
	    	    	    d[j][k]=Math.min(d[j][k], d[j][i]+d[i][k]);
	    			}
	    	    }
		    }
	    }

	    List l=new ArrayList<Integer>();
	    f(l,rs);
	    System.out.println(min);


        //System.out.println(ns);
	}

	public static void f(List<Integer> l, int[] rs) {
		if(l.size()==rs.length) {
			long k=0;
			for (int i=1; i<l.size();i++) {
				k+=d[l.get(i-1)][l.get(i)];
			}
			min=Math.min(min, k);
			return;
		}

		for (int i=0; i<rs.length;i++) {
			if(!l.contains(rs[i])) {
				List nl=new ArrayList<Integer>();
				nl.addAll(l);
				nl.add(rs[i]);
				f(nl,rs);
			}
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

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	static Scanner scanner;
	static int n;
    static int m;
    static int[] A;
    static int[] B;
	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    n=gi();
	    m=gi();
	    A=new int[m];
	    B=new int[m];

	    for (int i=0; i<m;i++) {
	    	A[i]=gi();
	    	B[i]=gi();
	    }
	    int c=0;
	    for(int i=0; i<m;i++) {
	    	List<Integer> l = new ArrayList<Integer>();
	    	l.add(A[i]);
	    	if(!f(i, l)) {
	    		c++;
	    	}
	    }
	    System.out.println(c);
//	    if (isNumber(s1) && isNumber(s2) && s.charAt(a) == '-') {
//	    	System.out.print("Yes");
//	    }else {
//	    	System.out.print("No");
//	    }



	}

    public static boolean f(int b, List<Integer> l) {
    	boolean g= false;
    	int ln=l.get(l.size()-1);
        for (int i=0; i<m; i++) {
        	if(i==b) continue;
        	if(ln==A[i] && !l.contains(B[i])) {
        		if(B[i]==B[b])return true;
        		List<Integer> l2 = new ArrayList<Integer>();
        		l2.addAll(l);
        		l2.add(B[i]);
        		g=f(b,l2);
        		if(g)return true;
        	} else if(ln== B[i] && !l.contains(A[i])) {
        		if(A[i]==B[b])return true;
        		List<Integer> l2 = new ArrayList<Integer>();
        		l2.addAll(l);
        		l2.add(A[i]);
        		g=f(b,l2);
        		if(g)return true;
        	}
        }

        return false;
    }

	public static int d(int n) {
		int m=0;
		while(true) {
			if(n<1) {
				break;
			}
			int l= n%10;
			m+=l;
			n= (n-l)/10;
		}
		return m;
	}
	public static long d(long n) {
		String a=String.valueOf(n);
		return (long)a.length();
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
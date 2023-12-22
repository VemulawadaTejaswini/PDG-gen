
import java.util.Collections;
import java.util.Scanner;

public class Main {

	static Scanner scanner;

	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    int N=gi();
	    String S=gs();
	    
	    int s=0;
	    for (int i=0; i<N;i++) {
	    	char c=S.charAt(i);
	    	if(c==')') {
	    		s++;
	    	} else {
	    		break;
	    	}
	    }
	    
	    int e=0;
	    for (int i=N-1; i>=0;i--) {
	    	char c=S.charAt(i);
	    	if(c=='(') {
	    		e++;
	    	} else {
	    		break;
	    	}
	    }
	    
	    StringBuilder sb=new StringBuilder();
	    for(int i=0; i<s;i++) {
	    	sb.append('(');
	    }
	    sb.append(S);
	    for(int i=0; i<e;i++) {
	    	sb.append(')');
	    }
	    String ns=sb.toString();
	    
	    int sc=0;
	    int ec=0;
	    for (int i=0; i<ns.length();i++) {
	    	char c=ns.charAt(i);
	    	if(c=='(') {
	    		sc++;
	    	} else {
	    		ec++;
	    	}
	    }
	    
	    if (sc>ec) {
	    	ns=ns + String.join("", Collections.nCopies(sc-ec, ")"));
	    }else if(ec>sc){
	    	ns=String.join("", Collections.nCopies(ec-sc, "("))+ns;
	    }

        System.out.println(ns);
	}

	public static class Edge {
	    private int from;
	    private int to;
	    private long cost;

	    public Edge(int f, int t, long c) {
	    	this.from=f;
	    	this.to=t;
	    	this.cost=c;
	    }

	    public int gfrom() {
	    	return from;
	    }

	    public int gto() {
	    	return to;
	    }

	    public long gcost() {
	    	return cost;
	    }

	    public void sfrom(int f) {
	    	from=f;
	    }

	    public void sto(int t) {
	    	to=t;
	    }

	    public void scost(int c) {
	    	cost=c;
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
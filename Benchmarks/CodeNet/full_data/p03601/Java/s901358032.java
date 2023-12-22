
import java.util.Scanner;

public class Main {

	static Scanner scanner;
	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    int A=gi();
	    int B=gi();
	    int C=gi();
	    int D=gi();
	    int E=gi();
	    int F=gi();

	    double maxn=0;
	    int ma=0;
	    int ms=0;
	    
	    for (int i=0; 100*A*i<=F; i++) {
	    	for (int j=0; 100*A*i+100*B*j<=F; j++) {
                if(i==0 && j==0) continue;
	    		for (int k=0; 100*A*i+100*B*j+C*k<=F; k++) {
	    			for (int l=0; 100*A*i+100*B*j+C*k+D*l<=F; l++) {
                        double n=(double)(k*C+l*D)/(double)(100*(i*A+j*B));
                        if(n>=maxn && (i*A+j*B)*E>=(k*C+l*D)) {
                        	maxn=n;
                        	ma=100*A*i+100*B*j+C*k+D*l;
                        	ms=C*k+D*l;
                        }
	    		    }
	    	    }
		    }
	    }
	    
	    System.out.print(ma + " "+ ms);
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
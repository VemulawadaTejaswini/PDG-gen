import java.util.Scanner;

public class Main {

	static Scanner scanner;

	public static void main(String[] args) {
	    scanner = new Scanner(System.in);
	    int h=gi();
	    int w= gi();
	    String[][] x=new String[h+2][w+2];
	    for (int i=0; i<w+2;i++) {
    		x[0][i]=".";
    	}
	    for(int i=1; i<=h;i++) {
	    	x[i][0]=".";
	    	String s=gs();
	    	for (int j=1; j<=w;j++) {
	    		x[i][j]=String.valueOf(s.charAt(j-1));
	    	}
	    	x[i][w+1]=".";
	    }
	    for (int i=0; i<w+2;i++) {
    		x[h+1][i]=".";
    	}
	    
	    for(int i=1; i<=h;i++) {
	    	for (int j=1; j<=w;j++) {
	    		if (x[i][j].equals(".")) {
	    			int c=0;
	    			if (x[i-1][j-1].equals("#"))c++;
	    			if (x[i-1][j].equals("#"))c++;
	    			if (x[i-1][j+1].equals("#"))c++;
	    			if (x[i][j-1].equals("#"))c++;
	    			if (x[i][j+1].equals("#"))c++;
	    			if (x[i+1][j-1].equals("#"))c++;
	    			if (x[i+1][j].equals("#"))c++;
	    			if (x[i+1][j+1].equals("#"))c++;
	    			x[i][j]=String.valueOf(c);
	    		}
	    	}
	    }
	    
	    for(int i=1; i<=h;i++) {
	    	for (int j=1; j<=w;j++) {
	    		System.out.print(x[i][j]);
	    	}
	    	System.out.println();
	    }

	    
	    //System.out.print(c);
//	    if (s.contains("AC")) {
//	    	System.out.print("Yes");
//	    }else {
//	    	System.out.print("No");
//	    }


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
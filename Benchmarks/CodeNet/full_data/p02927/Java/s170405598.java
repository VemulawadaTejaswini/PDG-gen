

import java.util.Scanner;

public class Main {

	static Scanner scanner;

	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

        int M=gi();
        int D=gi();
        
        int c=0;
        for (int i=1;i<=M;i++) {
        	for (int j=22;j<=D;j++) {
            	int one=j%10;
            	int ten=(j-one)/10;
            	if(one>=2 && ten>=2 && one*ten==i) c++;
            }
        }

        System.out.print(c);

//        if (s>L[n-2]) {
//        	System.out.println("Yes");
//        }else {
//        	System.out.println("No");
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

	// doubleとして入力を取得
	public static double gd() {
		return Double.parseDouble(scanner.next());
	}
}
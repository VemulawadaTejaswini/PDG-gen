import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	try {
    		final int n = sc.nextInt();
    		final int m = sc.nextInt();

    		int [] s = new int[m];
    		char [] c = new char[m];
    		for (int i=0; i<m; i++) {
    			s[i] = sc.nextInt();
    			c[i] = sc.next().charAt(0);
    		}

    		char [] str = new char[n];
    		str[0] = '1';
    		for (int i=0; i<n; i++) {
    			str[i] = '0';
    		}

    		for (int i=0; i<m; i++) {
    			str[s[i]-1] = c[i];
    		}

    		if (str[0] == '0') {
    			System.out.println("-1");
    		} else {
        		for (int i=0; i<n; i++) {
        			System.out.print(str[i]);
        		}
        		System.out.println();
    		}

    	} finally {
    		sc.close();
    	}
    }
}

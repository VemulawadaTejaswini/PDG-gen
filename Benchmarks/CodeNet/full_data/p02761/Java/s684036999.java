import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	try {
    		final int n = sc.nextInt();
    		final int m = sc.nextInt();

    		int [] s = new int[m];
    		char [] c = new char[m];
    		boolean [] modified = new boolean[n];
    		for (int i=0; i<m; i++) {
    			s[i] = sc.nextInt();
    			c[i] = sc.next().charAt(0);
    		}

    		char [] str = new char[n];
    		str[0] = '1';
			modified[0] = false;
    		for (int i=0; i<n; i++) {
    			str[i] = '0';
    			modified[i] = false;
    		}

    		for (int i=0; i<m; i++) {
    			if (modified[s[i]-1] && str[s[i]-1] != c[i]) {
        			System.out.println("-1");
        			return;
    			} else {
        			str[s[i]-1] = c[i];
        			modified[s[i]-1] = true;
    			}
    		}

    		if (n > 1 && str[0] == '0') {
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

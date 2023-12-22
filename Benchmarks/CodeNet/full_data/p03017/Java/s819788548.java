import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();
    int D = sc.nextInt();
    String S = sc.next();
    char[] c = new char[S.length()];
    boolean finishA = false;
    boolean finishB = false;
    boolean cannotA = false;
    boolean cannotB = false;


    for(int i = 0; i < S.length(); i++) {
    	c[i] = S.charAt(i);
    	if(i+1 == A) {
    		c[i] = 'A';
    	} else if(i+1 == B) {
    		c[i] = 'B';
    	}
    }

    while(true) {
    	for(int i = 0;; i++) {
    		if(i + 1 == S.length()) {
    			cannotA = true;
    			break;
    		}
    		if(c[i] == 'A' && c[i+1] == '.') {
	    		c[i] = '.';
	    		c[i+1] = 'A';
	    		break;
    		}
    		if(i + 2 == S.length()) {
    			cannotA = true;
    			break;
    		}
    		else if(c[i] == 'A' && c[i+1] != '.' && c[i+2] == '.') {
    			c[i] = '.';
	    		c[i+2] = 'A';
	    		break;
    		}
    		else if(i == C) {
    			finishA = true;
    			break;
    		}
    	}

    	for(int i = 0;; i++) {
    		if(i + 1 == S.length()) {
    			cannotB = true;
    			break;
    		}
    		if(c[i] == 'B' && c[i+1] == '.') {
	    		c[i] = '.';
	    		c[i+1] = 'B';
	    		break;
    		}
    		if(i + 2 == S.length()) {
    			cannotB = true;
    			break;
    		}
    		else if(c[i] == 'B' && c[i+1] != '.' && c[i+2] == '.') {
    			c[i] = '.';
	    		c[i+2] = 'B';
	    		break;
    		}
    		else if(i == D) {
    			finishB = true;
    			break;
    		}
	    }

    	if(finishA && finishB) break;
    	else if(cannotA && cannotB) break;
    	cannotA = false;
    	cannotB = false;
    }

    if(finishA && finishB) {
    	System.out.println("YES");
    } else {
    	System.out.println("NO");
    }
  }
}

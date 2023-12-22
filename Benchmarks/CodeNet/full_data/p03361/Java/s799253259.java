import java.util.*;
public class Main {
    public static void main(String[] args) {	
	Main main = new Main();
    	main.solveC();
    }
    
    private void solveA() {
	Scanner sc = new Scanner(System.in);
    	int A = sc.nextInt();
    	int B = sc.nextInt();
    	System.out.println(A <= B ? A: A-1);
    }

    private void solveB() {
	Scanner sc = new Scanner(System.in);
	int[] n = new int[3];
	for(int i=0; i < 3; i++){
	    n[i] = sc.nextInt();	    
	}
	Arrays.sort(n);

	int k = sc.nextInt();

	for(int i=0; i < k; i++){
	    n[2] = n[2] * 2;	    
	}

	System.out.println(n[0] + n[1] + n[2]);
    }
    private void solveC() {
	Scanner sc = new Scanner(System.in);
	int h = sc.nextInt();
	int w = sc.nextInt();
	String[] n = new String[h+2];
	boolean b = true;

	n[0] = ".........................................................";
	n[h+1] = ".........................................................";

	for(int i=1; i < h+1; i++){
	    String s = sc.next();
	    n[i] = "."+ s + ".";
	}

	for(int i=1; i < h+1; i++){
	    for(int j=1; j < w+1; j++){
		if (n[i].charAt(j) == '#' && n[i-1].charAt(j) == '.'
		                   && n[i+1].charAt(j) == '.'
		                   && n[i].charAt(j-1) == '.'
		                   && n[i].charAt(j+1) == '.'){
		    b = false;
		}
	    }
	    
	}
	
	System.out.println(b ? "Yes" : "No");
    }
}
import java.util.*;

public class Main {
    public static void main(String[] args) {	
	Main main = new Main();
    	main.solveB();
    }
    
    private void solveA() {
    	Scanner sc = new Scanner(System.in);
    	String s = sc.next();
	int top = 0;

	for(int i=0; i < 3; i++){
	    if (s.charAt(i) == 'o') top += 100;
	}
	
    	System.out.println(700 + top);
    }

    private void solveB() {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
    	int x = sc.nextInt();
	int cnt = 0;

	int[] m = new int[n];

	for(int i=0; i < n; i++){
	    m[i] = sc.nextInt();	    
	}

	Arrays.sort(m);

	for(int i=0; i < n; i++){
	    x -= m[i];
	    cnt++;
	}

	System.out.println(cnt + x/m[0]);
    }
}
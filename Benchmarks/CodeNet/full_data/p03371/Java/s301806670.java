import java.util.*;

public class Main {
    public static void main(String[] args) {	
	Main main = new Main();
    	main.solveC();
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
    private void solveC() {
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c = sc.nextInt();
	int x = sc.nextInt();
	int y = sc.nextInt();
	int max = Math.max(x,y);

	int ans1 = a * x + b * y;
	int ans2 = max == x ? c*y*2 + a*(x-y) : c*x*2 + b*(y-x);
	int ans3 = c * max * 2;

	System.out.println(Math.min(Math.min(ans1,ans2),ans3));
       
    }
    private void solveD() {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int[] a = new int[n];
    }
	
}

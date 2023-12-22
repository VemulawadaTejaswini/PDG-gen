import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	
    	int t[] = new int[n+1];
    	int x[] = new int[n+1];
    	int y[] = new int[n+1];
    	
    	t[0] = 0 ;
    	x[0] = 0 ;
    	y[0] = 0 ;
    	
    	boolean result = true;
    	
    	for(int i = 1; i <= n; i++) {
    		t[i] = sc.nextInt();
    		x[i] = sc.nextInt();
    		y[i] = sc.nextInt();
    		
    		int tempx = Math.abs(x[i] - x[i-1]);
    		int tempy = Math.abs(y[i] - y[i-1]);
    		int tempt = Math.abs(t[i] - t[i-1]);
    		
    		if ((tempx + tempy)> tempt) {
    			result = false;
    			break;
    		}
    		
    		if ((tempx +tempy) %2 != tempt %2) {
    			result = false;
    			break;
    		}
    	}
    	
    	sc.close();
    	
    	if (result) {
    		System.out.println("Yes");
    	} else {
    		System.out.println("No");
    	}
    }
}

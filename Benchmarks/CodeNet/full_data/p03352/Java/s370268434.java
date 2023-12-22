import java.util.*;
 
public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int X = sc.nextInt();
    	if (X < 4) {
    		System.out.println(1);
    	}
    	int ans = 0;
    	for (int i = 2; i <= X; i++) {
    		int d = 0;
    		for (int j = 2; d < X; j++) {
    			if (ans < d) {
    				ans = d;
    			}
    			d = (int) Math.pow(i, j);
    		}
    	}
    	System.out.println(ans);
    }
}
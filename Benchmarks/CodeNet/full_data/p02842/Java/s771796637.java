import java.util.*;
 
public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	int X = -1;
    	for (int i = 1; i <= 50000; i++) {
    		if ((i*108)/100 == N) {
    			X = i;
    		}
    	}
    	System.out.println(X != -1 ? X : ":(");
    }
}
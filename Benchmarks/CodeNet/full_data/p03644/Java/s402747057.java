import java.io.PrintWriter;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Main { 
	
    public static void main(String[] args) {
    	
    	PrintWriter out = new PrintWriter(System.out);
    	Scanner in = new Scanner(System.in);
    	new Main().solve(in, out);
    	in.close();
        out.close();
    }
    
    private void solve(Scanner in, PrintWriter out) {
    	
    	int N = in.nextInt();
    	LinkedList list = new LinkedList();
    	for(int i=2; i<=N; i++) {
    		list.push(dividedCount(i));
    	}
    	
    	System.out.println(Collections.max(list));
    	
    }
    
    private int dividedCount(int n) {
    	if(n%2!=0 || n<=1) 
    		return 0;
    	
    	return 1+dividedCount(n/2); 
    	    	
    }
   
}
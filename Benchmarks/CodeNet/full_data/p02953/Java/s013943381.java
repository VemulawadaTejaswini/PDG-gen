import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    
    if(N < 2) {
    	System.out.println("Yes");
    }
    else {
    	int a, b, count;
    	String output = "Yes";
    	a = sc.nextInt();
    	b = sc.nextInt();
    	count = 0;
    	for(int i = 2; i < N; i++) {
    		int c = sc.nextInt();
    		if(b - a <= -1) {
    			count++;
    		}
    		if(c - b <= -1) {
    			b--;
    			count++;
    		}
    		if(c - a <= -2 || count == 2) {
    			output = "No";
    			break;
    		}
    		a = b;
    		b = c;
    	}
    	System.out.println(output);
    	sc.close();
    }
  }
}
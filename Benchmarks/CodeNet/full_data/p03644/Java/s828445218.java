import java.util.*;

class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
      	int n = Integer.parseInt(sc.next());
      	int ans = 0;
      	
      	for (int i = 0; i < n; i++) {
        	if (n < (int)Math.round(Math.pow(2, i))) break;
          	ans = (int)Math.round(Math.pow(2, i));
        }
      	
      	System.out.println(ans);
    }
}
import java.util.*;

public class Main{
	public static void main(String[] args) {
    	Scanner itr = new Scanner(System.in);
      	int n = itr.nextInt();
      
      	dfs("", 'a', n);
    
    }
  
  	public void dfs(String s, char max, int n) {
    	if (n == s.length()) {
        	System.out.println(s);
          	return;
        }
      
      	for (char i = 'a'; i <= max; i++) {
        	dfs(s + i, (max == i ? max + 1 : max));
        }
    }
}

import java.util.*;
 
public class Main{
	public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
      	int n = scan.nextInt();
      	int d = scan.nextInt();
      	int sight = 2 * d + 1;
      	int ans = (n / sight) ;
      	if(n % sight == 0) {
        	System.out.print(ans);
        }
      	else {
        	System.out.print(ans + 1);
        }
    }
}
import java.util.*;
 
public class Main{
	public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
      	int n = scan.nextInt();
      	int d = scan.nextInt();
      	int sight = 2 * d + 1;
      	if(n % d == 0) {
        	System.out.print(n / sight);
        }
      	else {
        	System.out.print(n / sight + 1);
        }
    }
}
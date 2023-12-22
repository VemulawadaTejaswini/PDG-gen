import java.util.*;

public class Main{
	public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);	
      	int n = scan.nextInt();//all balls
        int k = scan.nextInt();//blue ball
      	System.out.println(n - k + 1);
      	for(i = 2; i <= k; i ++){
        	System.out.println(fact(n - i + 1) / (fact(i) * fact(n - k)));
        }
    }
  	public  static int fact(int n ){
    	if(n < 1) {
        	return 1;
        }
      	else {
        	return n * fact(n - 1);
        }
    }
}
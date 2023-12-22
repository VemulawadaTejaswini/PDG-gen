import java.util.Scanner;

public class Main {

	public static void main(String[] args){
	      Scanner sc = new Scanner(System.in);
	      int A = sc.nextInt();
	      int B = sc.nextInt();
	      int C = sc.nextInt();
	      int X = sc.nextInt();
	      int Y = sc.nextInt();
	      sc.close();
	      
	      int price = 0;
	      
	      if(A + B > 2 * C) {
	    	  	price += Math.min(X, Y) * 2 * C;
	    	  	if(X > Y) {
	    	  		price += (Math.max(X, Y) - Math.min(X, Y)) * Math.min(A, 2 * C);
	    	  	}else {
	    	  		price += (Math.max(X, Y) - Math.min(X, Y)) * Math.min(B, 2 * C);
	    	  	}
	      }else {
	    	  	price += A * X + B * Y;
	      }
	      
	      System.out.println(price);
	      System.exit(0);
	    }
}
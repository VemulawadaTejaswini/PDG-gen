import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
    	int a,b,k;
    	
    	a = in.nextInt();
    	b = in.nextInt();
    	k = in.nextInt();
    	
    	int div = Math.abs(a-b);
    	int counter = 0;
    	
    	for (int i = div; i > 0; i--) {
    		if ((div) % i == 0) {
    			counter++;
    			if (counter == k) {
    				System.out.println(i);
    				return;
    			}
    		}
    	}
    	
    }

  }

import java.util.Scanner;
	public class Main
		{ public static void main(String[] args)
			{   
			    Scanner scanner = new Scanner(System.in);
			    int X = scanner.nextInt();
			    int t = scanner.nextInt();
			    
			    if (X-t >= 0) {
			    	System.out.println(X-t);
			    } else {
			    	System.out.println(0);
			    }
			    
		}
		}
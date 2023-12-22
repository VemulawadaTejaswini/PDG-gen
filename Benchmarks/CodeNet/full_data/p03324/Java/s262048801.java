import java.util.*;
import java.io.FileInputStream;
import java.io.InputStream;
 
public class Main {
 
	public static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
		int d = scan.nextInt();
      	int n = scan.nextInt();
      
      if(d == 0)
       	System.out.println(n);
      else
        System.out.println(n*(int)Math.pow(100, d));
		
	}
	
}
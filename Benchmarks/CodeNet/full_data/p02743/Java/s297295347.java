import java.util.*;
import java.math.*;

public class Main {
	public static void main(String[] args) {
    	Scanner itr = new Scanner(System.in);
      	long a = (long)itr.nextInt();
      	long b = (long)itr.nextInt();
      	long c = (long)itr.nextInt();
      
      	long item1 = 4L * a * b;
      	long item2 = (long) (c - a - b) * (c - a - b);
      	
      	
      	if (item1 < item2)
          System.out.println("Yes");
      	else
          System.out.println("No");
    } 
}

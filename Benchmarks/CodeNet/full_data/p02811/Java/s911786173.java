import java.util.*;
public class solution {
 	public static void main(String[] args) {
      Scanner s = new Scanner(System.in);	
      int k = s.nextInt();
      int x = s.nextInt();
      if (k * 500 >= x) {
      	System.out.println("Yes");
      } else {
       	System.out.println("No"); 
      }
    } 
}
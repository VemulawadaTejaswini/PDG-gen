import java.util.*;

public class Main {
  
 	public static void main(String[] args) {
     
      Scanner sc = new Scanner(System.in);
	  int n = Integer.parseInt(sc.next());
      int m = Integer.parseInt(sc.next());
      
      int max = m*n;
      
      if(max < m+n) {
        max = m+n;
      }
      
      if(max < m-n) {
        max = m-n;
      }
      
      System.out.println(max);
    }
  
}
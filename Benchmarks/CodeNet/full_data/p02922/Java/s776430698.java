import java.util.*;

public class Main {
  public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  int A = Integer.parseInt(sc.next());
	  int B = Integer.parseInt(sc.next());
	  
	  int count = B / A;
	  int temp = B % A;
	  if(count != 0 && temp > 0)
		  count++;
	  System.out.println(count);
	  sc.close();
	  
  }
}

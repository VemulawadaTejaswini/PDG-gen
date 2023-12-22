import java.util.*;

public class Main {
  public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  int N = Integer.parseInt(sc.next());
	  int X = Integer.parseInt(sc.next());
	  
	  int i = 2;
	  int D = 0;
	  while(D <= X && i <= N+1) {
		  System.out.println(D +", "+ i);
		  D = D + Integer.parseInt(sc.next());
		  i++;
	  }
	  System.out.println(i-2);
	  sc.close();
	  
  }
}
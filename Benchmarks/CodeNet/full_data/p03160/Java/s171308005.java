import java.util.*;

public class Main {
  public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  int N = Integer.parseInt(sc.next());
	  int[] h = new int[N];
	  for(int i = 0; i < N; i++)
		  h[i] = Integer.parseInt(sc.next());
	  
	  int[] temp = new int[N];
	  temp[0] = 0;
	  temp[1] = temp[0] + Math.abs(h[1] - h[0]);
	  for(int i = 2; i < N; i++) {
		  int a = Math.abs(h[i] - h[i-1]);
		  int b = Math.abs(h[i] - h[i-2]);
		  temp[i] = Math.min(a + temp[i-1], b + temp[i-2]);
	  }
	  System.out.println(temp[N-1]);
	  
	  sc.close();
	  
  }
}
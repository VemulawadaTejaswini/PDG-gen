import java.util.*;

public class Main {
    public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);

      int h = sc.nextInt();
      int n = sc.nextInt();
      
      int[] x = new int[n];
      
      int xAll = 0;
      
      for(int i = 0; i < n; i++) {
		x[i] = sc.nextInt();
        
        xAll = xAll + x[i];
      }
      
      
      
      if(h < xAll) {
      
        System.out.println("YES");
      } else {
      
        System.out.println("NO");
      }
    }
}

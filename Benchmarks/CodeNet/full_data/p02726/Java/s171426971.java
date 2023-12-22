import java.util.*;
 
public class Main {
  	public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int x = sc.nextInt();
      int y = sc.nextInt();
      
      int normal_route;
      int shortcut_route;
      int min;
      int[] array_k = new int[n];
      Arrays.fill(array_k, 0);
      
      for (int i = 1; i <= n; i++) {
        for (int j = i + 1; j <= n; j++) {
          normal_route = j - i;
          shortcut_route = Math.abs(x - i) + 1 + Math.abs(y - j);
          if (normal_route <= shortcut_route) {
            min = normal_route;
          } else {
            min = shortcut_route;
          }
          array_k[min] = array_k[min] + 1;
        }
      }
      
      for (int k = 1; k < n; k++) {
        System.out.println(array_k[k]);
      }
    }
}

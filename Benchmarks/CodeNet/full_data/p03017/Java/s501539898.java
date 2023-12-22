import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int a = sc.nextInt()-1;
      int b = sc.nextInt()-1;
      int c = sc.nextInt()-1;
      int d = sc.nextInt()-1;
      char[] grid = sc.next().toCharArray();

      for(int i = 0; i < n-1; i++) 
        if(grid[i] == '#' && grid[i+1] == '#') {
          System.out.println("No");
          return;
        }
      if(c > d) {
        for(int i = b; i < d; i++) {
          if(grid[i-1] == '.' && grid[i] == '.' && grid[i+1] == '.')
            break;
          if(i == d-1) {
            System.out.println("No");
            return;
          }
        }
      }
      System.out.println("Yes");
  }
}
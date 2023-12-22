import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] heights = new int[n];

      int minHeight = Integer.MAX_VALUE;
      for(int i = 0; i < n; i++) {
        heights[i] = sc.nextInt();
        if(heights[i] > 0)
          minHeight = Math.min(minHeight, heights[i]);
      }

      int cnt = 0;

      while(minHeight != Integer.MAX_VALUE) {
        
        int nextMinHeight = Integer.MAX_VALUE;
        int i = 0;
        int seg = 1;
        for(; i < n; i++) {
          if(heights[i] != 0) {
            i++;
            break;
          }
        }
        for(; i < n; i++) {
          if(heights[i-1] == 0 && heights[i] != 0)
            seg++;
        }
        cnt += minHeight * seg;
        for(i = 0; i < n; i++) {
          if(heights[i] == 0)  continue;
          heights[i] -= minHeight;
          nextMinHeight = Math.min(nextMinHeight, heights[i]);
        }
        minHeight = nextMinHeight;
      }
      System.out.println(cnt);
  }
}
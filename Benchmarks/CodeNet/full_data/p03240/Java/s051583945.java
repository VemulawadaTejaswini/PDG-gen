import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[][] arr = new int[n][3];
      for(int i = 0; i < n; i++) {
        arr[i][0] = sc.nextInt();
        arr[i][1] = sc.nextInt();
        arr[i][2] = sc.nextInt();
      }


      for(int cx = 0; cx <= 100; cx++) {
        loop:
        for(int cy = 0; cy <= 100; cy++) {
            int H = Integer.MAX_VALUE;
            for(int[] a : arr) {
              int x = a[0];
              int y = a[1];
              int h = a[2];
              if(h == 0) continue;
              H = h + Math.abs(x - cx) + Math.abs(y - cy);
              break;
            }
            for(int[] a : arr) {
              int x = a[0];
              int y = a[1];
              int h = a[2];
              if(Math.max(H - Math.abs(x - cx) - Math.abs(y - cy), 0) != h) {
                  continue loop;
              }
            }
 
            System.out.println(cx + " " + cy + " " + H);
            return;
        }
      }
  }
}
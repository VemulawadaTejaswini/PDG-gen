import java.util.*;


public class Main {
    public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
      int n = Integer.parseInt(sc.next());
      int ary[] = new int[n];
      for (int i = 0; i < ary.length; i++) {
        ary[i] = Integer.parseInt(sc.next());
      }
      
      if (isAscendingOrder(ary)) {
        System.out.print("YES");
      } else {
        System.out.print("NO");
      }
    }
  
  public static boolean isAscendingOrder(int[] ary) {
    int x = 0;
    int y = 0;
    int k = 0;
        for (int i = 0; i < ary.length -1; i++) {
          if (ary[i] > ary[i + 1]) {
            if (x == 0) {
              x = ary[i];
            } else if (y == 0) {
              y = ary[i + 1];
            }
          }
        }
        for (int i = 0; i < ary.length -1; i++) {
          if (ary[i] > ary[i + 1]) {
            if (k == 0) {
              ary[i] = y;
              k += 1;
            } else if (k == 1) {
              ary[i +1] = x;
              k += 1;
            }
          }
        }
        for (int i = 0; i < ary.length -1; i++) {
          if (ary[i] > ary[i + 1]) {
            return false;
          }
        }
        return true;
      }
}
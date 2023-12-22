import java.util.*;


public class Main {
    public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
      int n = Integer.parseInt(sc.next());
      int[] ary = new int[n];
      int sum = 0;
      for (int i = 0; i < n ; i++) {
        ary[i] = Integer.parseInt(sc.next());
      }
      for (int i = 1; i < n -1 ; i++) {
        if (ary[i -1] < ary[i] && ary[i] < ary[i+1]) {
          sum += 1;
        } else if (ary[i -1] > ary[i] && ary[i] > ary[i+1]) {
          sum += 1;
        }
      }
      System.out.println(sum);
      
    }
}
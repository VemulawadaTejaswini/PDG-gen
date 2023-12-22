import java.util.*;
import java.math.*;
import java.lang.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();

    int[] a = new int[m];
    int[] b = new int[m];


    for (int i = 0; i < m; i++) {
      a[i] = sc.nextInt();
      b[i] = sc.nextInt();
    }

    List<Integer> list1 = new ArrayList<Integer>();
    List<Integer> list2 = new ArrayList<Integer>();

    for (int i = 0; i < m; i++) {
      if (a[i] == 1) {
        list1.add(b[i]);
      }

      if (b[i] == n) {
        list2.add(a[i]);
      }
    }

    // for (Integer value : list2) {
    //   System.out.println(value);
    // }

  for (Integer i : list2) {
    if (list1.contains(i)) {
      System.out.println("POSSIBLE");
      return;
    }
  }

  System.out.println("IMPOSSIBLE");




  }

}

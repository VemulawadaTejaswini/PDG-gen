import java.util.*;

public class Main{
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int[] dishes = new int[5];
    int sum = 0;
    int fraction = 0; //端数：fraction
    
    for (int i = 0; i < dishes.length; i++) {
        dishes[i] = sc.nextInt();
        sum += ceil(dishes[i]);
        fraction = Math.max(fraction, amari(dishes[i]));
    }
    System.out.println(sum - fraction);

  }
  
  public static int ceil(int src) {
      if ((src % 10) != 0) {
          return (src / 10 + 1) * 10;
      } else {
          return src;
      }
  }
  
  public static int amari(int src) {
      if ((src % 10) == 0) {
          return 0;
      } else {
          return 10 - src % 10;
      }
  }
  
}
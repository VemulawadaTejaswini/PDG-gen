import java.util.*;


public class Main {
    public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
      int n = Integer.parseInt(sc.next());
      double m = Double.parseDouble(sc.next());
      double[] ary = new double[n];
      double sum = 0.0;
      double c = 0.0;
      for (int i = 0;i < n;i++) {
        ary[i] = Double.parseDouble(sc.next());
        sum += ary[i];
      }
      for (int i = 0; i < n  ; i++) {
        if (ary[i] >= sum / ( 4* m)) {
          c += 1;
        }
      }
      if (c >= m) {
        System.out.println("Yes");
      } else {
        System.out.println("No");
      }
    }
}
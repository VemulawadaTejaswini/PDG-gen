import java.util.*;

public class Main{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int n = Integer.parseInt(sc.next());

      double[] x = new double[n];
      double[] y = new double[n];
      for(int i=0;i<n;i++){
        x[i] = Double.parseDouble(sc.next());
        y[i] = Double.parseDouble(sc.next());
      }

      double[] z = new double[n];

      double sum = 0;

      //全2点間の距離を加算
      for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
          double dx = x[i]-x[j%n];;
          double dy = y[i]-y[j%n];
          z[i] = Math.sqrt(Math.pow(dx,2)+Math.pow(dy,2));
          sum += z[i];
        }
      }

      //どの2点間に関しても、2(n-1)!回通る。
      //全通りはn!
      //sum*2(n-1)!/n!=sum*2/n;

      sum = sum*2/n;

      System.out.println(sum);

    }
}

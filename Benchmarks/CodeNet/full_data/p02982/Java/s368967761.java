import java.util.*;
public class Main{
  public static void main(String[]args){
      Scanner sc = new Scanner(System.in);

      int n = sc.nextInt();
      int d = sc.nextInt();

      int[][] x = new int[n+1][d+1];
      int z = 10;
      int s = 0;
      int count = 0;

      for (int j = 1; j<=n; j++) {
      for (int i = 1; i<=d; i++) {
        x[j][i] = sc.nextInt();
      }
    }

      for (int j = 1;j<n ;j++ ) {
        for (int k = 0;k+j<n ;k++) {
         s = 0;
        for (int i = 1;i<=d ;i++ ) {
             s = s + Math.abs(x[j][i]-x[j+1+k][i])*Math.abs(x[j][i]-x[j+1+k][i]);
        }
        double a = Math.sqrt(s);

        if(a==(int)a){
          count++;
        }
      }
    }


      System.out.println(count);
}
}

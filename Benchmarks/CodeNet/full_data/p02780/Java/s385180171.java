
import java.util.*;
public class Main{
  public static void main(String []args){
  Scanner sc = new Scanner(System.in);

  int n = sc.nextInt();
  int k = sc.nextInt();
  int[] p  =new int[n];
  double kk = k;
  int max = 0;

  for (int i = 0;i<n ;i++ ) {
    p[i] = sc.nextInt();
  }

  double sum = 0;
  int pe;
  int pesum = 0;

  for (int i = n-1;k>0 ;i-- ) {
    System.out.println(p[i]);
      pe = p[i];
    for (int j = 0;p[i]>0 ;j++ ) {
      sum += (double)p[i]/pe;
      p[i]-=1;
    }
    pesum +=pe;
    k--;
  }
  System.out.println(sum);


}
}

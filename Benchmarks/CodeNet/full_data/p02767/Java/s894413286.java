import java.util.*;
public class Main{
  public static void main (String args[]){
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    double[] list = new double[n];
    
    double sum = 0;
    for (int i = 0; i < n; i++){
      list[i] = sc.nextDouble();
      sum += list[i];
    }
    
    long p = Math.round(sum/n);
    
    double ans = 0;
    for (int i = 0; i < n; i++){
      double d = Math.pow(list[i]-p, 2);
      ans += d;
    }
    
    System.out.print((int)ans);
    
  }
}
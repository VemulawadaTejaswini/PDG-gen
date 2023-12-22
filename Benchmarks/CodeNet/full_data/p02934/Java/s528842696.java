import java.util.*;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    double ans = 0;
    double[] ar = new double[n];
    for(int i=0;i<n;i++){
      ar[i] = 1 / sc.nextDouble();
      ans += ar[i];
    }
    System.out.println(1/ans);
  }
}
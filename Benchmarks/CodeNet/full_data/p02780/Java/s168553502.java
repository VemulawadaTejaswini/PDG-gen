import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int[] p = new int[n];
    for(int i = 0;i<n;i++)p[i]=sc.nextInt();
    double ki = 0.0;
    for(int i = 0;i<n-k+1;i++){
      double kita = 0.0;
      for(int j = 0;j<k;j++){
        kita += (double)(p[i+j]+1)/2;
      }
      ki = Math.max(ki,kita);
    }
    System.out.println(ki);
  }
}

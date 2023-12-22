import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] x = new int[n];
    int[] y = new int[n];
    for(int i=0;i<n;i++){
      x[i]=sc.nextInt();
      y[i]=sc.nextInt();
    }
    double[][] d = new double[n][n];
    for(int i=0;i<n;i++)
      for(int j=0;j<n;j++)d[i][j]=Math.sqrt((x[i]-x[j])*(x[i]-x[j])+(y[i]-y[j])*(y[i]-y[j]));
    int p = 1;
    for(int i=2;i<=n-1;i++)p*=i;
    double sum = 0;
    for(int i=0;i<n;i++)
      for(int j=0;j<n;j++)sum+=(double)p*d[i][j];
    sum/= p*n;
    System.out.println(sum);
  }
}
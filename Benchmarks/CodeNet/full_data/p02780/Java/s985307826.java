import java.util.*;

public class Main{
  public static double e(int n){
    return (double)(n+1)/(double)2;
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  	int n=sc.nextInt(),k=sc.nextInt();
    int[] p=new int[n];
    double max=0;
    for(int i=0;i<n;i++){
      p[i]=sc.nextInt();
    }
    for(int i=0;i<=n-k;i++){
      double sum=0;
      for(int j=0;j<k;j++){
        sum+=e(p[i+j]);
      }
      max=Math.max(max,sum);
    }
    System.out.println(max);
  }
}

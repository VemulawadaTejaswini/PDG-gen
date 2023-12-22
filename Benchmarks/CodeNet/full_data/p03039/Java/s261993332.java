import java.util.Scanner;
import java.lang.Math;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long N,M,K,i,j;
    long s = 0;
    N = sc.nextLong();
    M = sc.nextLong();
    K = sc.nextLong();
    long[][] a = new long[N][M];
    for(i=1;i<=K-1;i++){
      for(j=i+1;j<=K;j++){
        s+=Math.abs(a[i][i]-a[j][j]);
      }
    }
    System.out.println(s);
  }
}
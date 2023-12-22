import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long[][] cnt = new long[n][3];
    long[][] sum = new long[n][3];
    for(int i = 0;i < n;i++){
      cnt[i][0]=sc.nextLong();
      cnt[i][1]=sc.nextLong();
      cnt[i][2]=sc.nextLong();
    }
    for(int i=0;i<3;i++)sum[0][i]=cnt[0][i];
    for(int i=1;i<n;i++)
      for(int j=1;j<3;j++)
        sum[i][j]=cnt[i][j]+Math.max(sum[i-1][(j+1)%3],sum[i-1][(j+2)%3]);
    System.out.println(Math.max(sum[n-1][0],Math.max(sum[n-1][1],sum[n-1][2])));
  }
}
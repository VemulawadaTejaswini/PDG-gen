import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long[] a = new long[n];
    long[] b = new long[n];
    long[] c = new long[n];
    long[] bc = new long[n];
    for(int i = 0;i < n;i++)a[i]=sc.nextLong();
    for(int i = 0;i < n;i++)b[i]=sc.nextLong();
    for(int i = 0;i < n;i++)c[i]=sc.nextLong();
    Arrays.parallelSort(a);
    Arrays.parallelSort(b);
    Arrays.parallelSort(c);
    int k = 0;
    for(int j = 0;j < n;j++){
      while(k <= n-1&&b[j]>=c[k])k++;
      if(k==n)break;
      bc[j]=(long)n-k;
    }
    long tmp = 0;
    long sum = 0;
    int j = n-1;
    for(int i = n-1;i >= 0;i--){
      while(j >= 0&&a[i]<b[j]){
        tmp+=bc[j];
        j--;
      }
      if(j==n-1)continue;
      sum+=tmp;
    }
    System.out.println(sum);
  }
}
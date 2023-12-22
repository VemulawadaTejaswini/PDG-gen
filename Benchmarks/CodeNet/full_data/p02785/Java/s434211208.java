import java.util.*;
public class Main{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int k=sc.nextInt();
    long[] a=new long[n];
    for(int i=0;i<n;++i){
      a[i]=sc.nextInt();
    }
    if(k>=n){
      System.out.println("0");
    }
    else{
      Arrays.sort(a);
      int temp=n-k-1;
      long ans=0;
      for(int i=0;i<=temp;++i){
      	ans+=a[i];
      }
      System.out.println(ans);
    }
  }
}

import java.util.*;
public class Main{
  static long[] d;
  static long[] cnt;
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    d = new long[n+1];
    cnt = new long[n+1];
    d[0]=1;
    cnt[0]=1;
    for(int i=1;i<=n;i++){
      d[i]=2*d[i-1]+3;
      cnt[i]=2*cnt[i-1]+1;
    }
    long x = sc.nextLong();
    long p = find(n,x);
    System.out.println(p);
  }
  static long find(int n,long x){
    if(n==0)return 1;
    else if(x==1)return 0;
    else if(x<=d[n-1]+1)return find(n-1,x-1);
    else return cnt[n-1]+1+find(n-1,x-2-d[n-1]);
  }
}
import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a = sc.nextInt();
    int b = sc.nextInt();
    long[] v = new long[n];
    for(int i=0;i<n;i++)v[i]=sc.nextLong();
    Arrays.sort(v);
    long ans = 0;
    for(int i=1;i<=a;i++)ans+=v[n-i];
    long key = v[n-a];
    long k = 0;
    long m = 0;
    for(int i=0;i<n;i++)if(v[i]==key)m++;
    for(int i=1;i<=a;i++)if(v[n-i]==key)k++;
    System.out.println((double)ans/a);
    long cnt = 0;
    if(k<a)cnt = combination(m,k);
    else{
      for(int i=a;i<=b;i++)cnt+=combination(m,i);
    }
    System.out.println(cnt);
  }
  static long combination(long m,long k){
    long x = 1;
    for(long i=m;i>=m-k+1;i--)x=(x*i)/(m-i+1);
    return x;
  }
}
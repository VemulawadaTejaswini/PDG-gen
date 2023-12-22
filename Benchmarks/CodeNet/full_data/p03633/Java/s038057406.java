import java.util.*;
class Main{
  static long gcd (long m, long n) {
   if(m<n) return gcd(n,m);
   if(n==0) return m;
     return gcd(n,m%n);
  }
  static long lcm(long m,long n){
    return m/gcd(m,n)*n;
  }
  public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    int N=scan.nextInt();
    long[] T=new long[N];
    for(int i=0;i<N;i++){
      T[i]=scan.nextLong();
    }
    long tmp=lcm(T[0],T[1]);
    for(int i=2;i<N;i++){
      tmp=lcm(tmp,T[i]);
    }
    System.out.println(tmp);
  }
}
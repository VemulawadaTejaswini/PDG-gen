import java.util.*;

class Main{
  static long repow(long b,long p){
    long res=1;
    long a=b;
    while(p>0){
      if((p&1)==1){
        res*=a;
      }
      a*=a;
      p/=2;
    }
    return res;
  }
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    long t=100*n+1800*m;
    System.out.println(t*repow(2,m));
  }
}
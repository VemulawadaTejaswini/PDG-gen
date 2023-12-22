import java.util.*;

class Main{
  static long gcd(long c,long d){
    while(true){
      long f=c%d;
      if(f==0){
        return d;
      }
      c=d;
      d=f;
    }
  }
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    long a=sc.nextLong();
    long b=sc.nextLong();
    long c=gcd(a,b);
    long d=1;
    for(long i=2;i<=c;i++){
      if(c%i==0){
        d++;
        while(c%i==0){
          c/=i;
        }
      }
    }
    System.out.println(d);
  }
}
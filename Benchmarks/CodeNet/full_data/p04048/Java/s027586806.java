import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    long n=sc.nextLong();
    long x=sc.nextLong();
    long a=n-x;
    long b=x;
    long tmp;
    long ans=n;
    while(true){
      System.err.println(b+"/"+a+"="+(b/a)+":"+(b%a));
      ans+=(b/a)*2*a;
      if(b%a==0){
        break;
      }
      tmp=a;
      a=b%a;
      b=tmp;
    }
    System.out.println(ans-a);
  }
}
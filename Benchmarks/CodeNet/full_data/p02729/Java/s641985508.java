import java.util.*;
class Main
{
  static long fact(int n)
  {
    long f=1;
    for(;n>0;n--)
      f*=n;
    return(f);
  }
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int N=sc.nextInt();
    int M=sc.nextInt();long a,b;
    if(M==2)
      a=1;
    else
     a=(M*(M-1))/2;
    if(N==2)
       b=1;
    else
     b=(N*(N-1))/2;
    System.out.println(a+b);
  }
}
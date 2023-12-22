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
    int L=sc.nextInt();
    long  a,b,c;
    a=L/3;
    b=(L-a)/2;
    c=L-(a+b);
    double p=a*b*c;
    System.out.println(p);
  }
}
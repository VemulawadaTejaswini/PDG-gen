import java.io.*;
import java.util.*;
class ac
{
  public static void main(String[] ar)throws Exception
  {
    Scanner p= new Scanner(System.in) ;
    long n= p.nextLong();
    long m= p.nextLong();
    if(n==m && n*m!=0)
      System.out.println("Yes");
    else
      System.out.println("No");
  }
}
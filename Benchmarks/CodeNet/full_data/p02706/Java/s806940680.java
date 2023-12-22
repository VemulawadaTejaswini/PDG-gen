import java.util.Scanner;
public class Main
{
  public static void main(String args[])
  {
     Scanner sc=new Scanner(System.in);
    int a,b;
    a=sc.nextInt();
    b=sc.nextInt();
    if((b(b+1))/2 > a)
      System.out.println("-1");
    int c=(b(b+1))/2;
    System.out.println(c-a);
  }
}
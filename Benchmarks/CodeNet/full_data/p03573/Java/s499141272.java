import java.util.Scanner;
class Main 
{
  public static void main(String[] args) 
  {
    Scanner input=new Scanner(System.in);
    int a=input.nextInt();
    int b=input.nextInt();
    int c=input.nextInt();
    if(a>=-100 && b>=-100 && c>=-100 && a<=100 && b<=100 && c<=100)
    {
      if(a==b && a!=c)
      {
        System.out.println(c);
      }else
      if(b==c && b!=a)
      {
        System.out.println(a);
      }else
      if(a==c && a!=b)
      {
      System.out.println(b);
      }
    }
  }
}
import java.util.Scanner;
class Main 
{
  public static void main(String[] args) 
  {
    Scanner input=new Scanner(System.in);
    int a=input.nextInt();
    int b=input.nextInt();
    if(a>=1 && a<=100 && b>=1 && b<=100)
    {
      String temp=""+a+""+b;
      int c=Integer.parseInt(temp);
      Double d=Math.sqrt(c);
      int e = d.intValue();
      if(d==e)
      {
        System.out.println("Yes");
      }else
      System.out.println("No");
    }
  }
}
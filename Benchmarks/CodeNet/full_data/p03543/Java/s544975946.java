import java.util.Scanner;
class Main 
{
  public static void main(String[] args) 
  {
    Scanner input=new Scanner(System.in);
    int a=input.nextInt();
    if(a>=1000 && a<=9999)
    {
    String s=""+a;
    char c1=s.charAt(0);
    char c2=s.charAt(1);
    char c3=s.charAt(2);
    if(c1==c2 && c2==c3)
    {
      System.out.println("Yes");
    }else
    System.out.println("No");
    }
  }
}
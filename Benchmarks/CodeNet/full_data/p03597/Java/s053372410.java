import java.util.Scanner;
class Main 
{
  public static void main(String[] args) 
  {
    Scanner input=new Scanner(System.in);
    int a=input.nextInt();
    int b=input.nextInt();
    int temp=a*a;
    if(a>=1 && a<=100 && b>=0 && b<=temp)
    {
      System.out.println(temp-b);
    }
  }
}
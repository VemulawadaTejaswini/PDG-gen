import java.util.Scanner;
class Main
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    
    int n=sc.nextInt();
    String s=sc.next();
    if (n<3200)
      System.out.println("Red");
    else
      System.out.println(s);
  }
}
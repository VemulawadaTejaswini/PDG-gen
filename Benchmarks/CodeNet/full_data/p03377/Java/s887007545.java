import java.util.Scanner;
public class A
{
  public static void main(String [] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Number of cats 'A':");
    int a=sc.nextInt();
    System.out.println("Number of cats or dogs 'A+B':");
    int b=sc.nextInt();
    System.out.println("Exact number of cats:");
    int x=sc.nextInt();
    if(x-a>=0&&x-a<=b)
    {
      System.out.println("YES");
    }
    else
      System.out.println("NO");
  }
}
import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    try(Scanner sc = new Scanner(System.in))
    {
      final int a = sc.nextInt();
      final int b = sc.nextInt();
      
      if( (a*b)%2 == 0 )
      {
        System.out.println("Even");
      }
      else
      {
        System.out.println("Odd");
      }
    }
  }
}
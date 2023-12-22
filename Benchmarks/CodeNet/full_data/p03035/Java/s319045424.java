import java.util.Scanner;
class a
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    int A = scan.nextInt();

    Scanner scan1 = new Scanner(System.in);
    int B = scan1.nextInt();

    if(A >= 13)
    {
      System.out.println(B);
    }
    else if(6 <= A && A <= 12)
    {
      System.out.println(B/2);
    }
    else
    {
      System.out.println(0);
    }
  }
}

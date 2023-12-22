import java.util.Scanner;
public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();
    swap(A,B);
    swap(A,C);
    A.println();
    B.println();
    C.println();
    
  }
}
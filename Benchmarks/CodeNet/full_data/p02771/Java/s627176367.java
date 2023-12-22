impimport java.util.Scanner;
public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();
    if(A == B && B != C)
      System.out.println("Yes");
    if(B == C && C != A)
      System.out.println("Yes");
    if(A == C && A != B)
      System.out.println("Yes");
    
     if(A == B && B == C)
      System.out.println("No");
    if(B == C && C == A)
      System.out.println("No");
    if(A == C && A == B)
      System.out.println("No");
    
     if(A != B && B != C)
      System.out.println("No");
    if(B != C && C != A)
      System.out.println("No");
    if(A != C && A != B)
      System.out.println("No");
    
  }
}

import java.util.*;
public class Problem
{
      public static void main(String[] args)
      {
            Scanner sc = new Scanner(System.in);
            int A = sc.nextInt();
            int B = sc.nextInt();
            int X = sc.nextInt();
            
            if(A<B && A<X && B<X)
            {
                  System.out.println("YES");
            }
            else if(A<B && A<X && B>X)
            {
                  System.out.println("YES");
            }
            else if(A>B && A<X && B<X)
            {
                  System.out.println("YES");
            }
            else
            {
                  System.out.println("NO");
            }
      }
}
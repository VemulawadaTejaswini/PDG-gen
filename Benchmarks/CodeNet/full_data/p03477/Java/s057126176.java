import java.util.Scanner;

public class ALibra
{

    public static void main(String[] args)
    {
       Scanner input = new Scanner(System.in);
       int A = input.nextInt();
       int B = input.nextInt();
       int C = input.nextInt();
       int D = input.nextInt();
       
       if(A+B > C+D)
       {
           System.out.print("Left");
       }
       if(A+B == C+D)
       {
           System.out.print("Balanced");
       }
       if(A+B < C+D)
       {
           System.out.print("Right");
       }

    }

}

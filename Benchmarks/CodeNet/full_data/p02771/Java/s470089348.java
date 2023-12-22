import java.util.Scanner;
public class Exercise1 {

  public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Input first number: ");
        int e = in.nextInt();
        System.out.print("Input second number: ");
        int f = in.nextInt();
        System.out.print("Input third number: ");
        int g = in.nextInt();

        if (e == f && e == g)
        {
            System.out.println("All numbers are equal");
        }
        else if ((e == f) || (e == g) || (g == f))
        {
            System.out.println("Neither all are equal or different");
        }
        else
        {
            System.out.println("All numbers are different");
        }
    }
}
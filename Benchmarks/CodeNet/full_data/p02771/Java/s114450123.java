import java.util.Scanner;
 {

  public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Input first number: ");
        int a = in.nextInt();
        System.out.print("Input second number: ");
        int b = in.nextInt();
        System.out.print("Input third number: ");
        int c = in.nextInt();

        if (a== b && a == c)
        {
            System.out.println("No");
        }
        else if ((a == b) || (a == c) || (c == b))
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }
}
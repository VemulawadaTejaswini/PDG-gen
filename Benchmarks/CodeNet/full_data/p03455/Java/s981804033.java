import java.util.Scanner;

public class Main
{
    public static void main (String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int product = a * b;

        boolean even = product % 2 == 0;

        String out = even ? "Even" : "Odd";

        System.out.print(out);
    }
}

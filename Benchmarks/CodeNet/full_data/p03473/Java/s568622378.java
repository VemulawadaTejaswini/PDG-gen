import java.util.Scanner;

public class NewYear
{

    public static void Main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int M = input.nextInt();
        int x = 24*2 - M;
        System.out.print(x);

    }

}

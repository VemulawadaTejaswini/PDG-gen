import java.util.*;

class Main
{
    private static Scanner scan = new Scanner(System.in);

    public static void out(boolean flag)
    {
        if (flag)
        {
            System.out.println("ABC");
        }
        else
        {
            System.out.println("ABD");
        }
    }

    public static void main(String[] args)
    {
        int val = scan.nextInt();

        if (val < 1999)
        {
            if (val < 1000)
            {
                out(true);
            }
            else
            {
                out(false);
            }
        }
    }
}
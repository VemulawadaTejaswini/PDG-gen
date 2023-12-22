import java.util.*;

class Main
{
    private static Scanner scan = new Scanner(System.in);

    public static void out(boolean flag)
    {
        if (flag)
        {
            System.out.println("Yay!");
        }
        else
        {
            System.out.println(":(");
        }
    }

    public static void main(String[] args)
    {
        int a = scan.nextInt();
        int b = scan.nextInt();
        boolean flag = false;

        if (a < 9 && b < 9)
        {
            flag = true;
        }

        out(flag);
    }
}
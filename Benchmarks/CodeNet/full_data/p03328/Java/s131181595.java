import java.util.*;

class Main
{
    private static Scanner scan = new Scanner(System.in);

    public static void out(int i)
    {
        System.out.println(i);

    }

    public static void main(String[] args)
    {
        int tow1 = scan.nextInt();
        int tow2 = scan.nextInt();
        int tou = tow2 - tow1;
        int hight = 0;
        int snow;

        for (int i = 1; i <= tou; i++)
        {
            hight += i;
        }
        snow = hight - tow2;
        out(snow);
    }
}
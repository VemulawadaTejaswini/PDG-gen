import java.util.*;
public class Main
{
    public static void main (String [] args)
    {
        Scanner cin = new Scanner (System.in);
        int a = cin.nextInt();
        int b = cin.nextInt();
        int c = cin.nextInt();
        if((b * 10 + c ) % 4 == 0) System.out.print("Yes");
        else System.out.print("No");
    }
}
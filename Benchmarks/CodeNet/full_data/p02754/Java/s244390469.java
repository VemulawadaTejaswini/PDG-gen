import java.util.Scanner;

public class Main
{
    public static void main(String [] args)
    {
        Scanner key = new Scanner(System.in);
        long num = key.nextLong();
        long blue = key.nextLong();
        long red = key.nextLong();
        if(blue %2 != 0)
        {
            blue = blue + 1;
        }         
        System.out.println(blue);

    }
}
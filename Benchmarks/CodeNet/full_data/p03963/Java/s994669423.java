import java.util.Scanner;

public class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        if (n == 1)
            System.out.println(k);
        else
            System.out.println(k * Math.pow((k - 1), n - 1));
    }
}

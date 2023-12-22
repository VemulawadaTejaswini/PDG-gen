import java.util.*;

class Main
{
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args)
    {
        int dim = scan.nextInt();
        int num = scan.nextInt();
        int score = 1;
        int sum = 0;

        for (int i = 0; i < dim; i++)
        {
            score *= 100;
        }

        for (int i = 0; i < num; i++)
        {
            sum += score;
        }

        System.out.println(sum);
    }
}
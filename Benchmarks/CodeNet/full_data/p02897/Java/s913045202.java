import java.util.Scanner;

public class OddsOfOddness
{
    public static void main(String[] args)
    {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        float oddcount = 0;
        float answer =0;
        for (int i=1;i<=n;i++)
        {
            if (i%2!=0)
            {
                oddcount++;
            }
        }
        answer = oddcount/n;
        System.out.println(answer);
    }
}

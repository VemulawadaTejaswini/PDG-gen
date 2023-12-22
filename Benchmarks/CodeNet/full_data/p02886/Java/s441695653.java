import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in1 = new Scanner(System.in);
        int N = in1.nextInt();
        int D[]=new int [N];
        Scanner d = new Scanner(System.in);
        int sum=0;
        for (int x=0;x<N;x++)
        {
            D[x]=d.nextInt();
        }
        for (int y=0;y<N-1;y++)
        {
            for (int x=y+1;x<N;x++)
            {
                sum+=D[x]*D[y];
            }
        }
        System.out.print(sum);
    }
}
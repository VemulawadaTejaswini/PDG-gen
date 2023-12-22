import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        final Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        final int M = sc.nextInt();

        final long[][] original = new long[M][3];
        final long[][] year = new long[1000001][2];
        final long[] inputOrder = new long[M];
        final int[] area = new int[N + 1];
        for (int i = 0; i < M; i++)
        {
            original[i][0] = i;
            original[i][1] = sc.nextInt();
            original[i][2] = sc.nextInt();
            year[(int) original[i][2]][0] = original[i][1];
            inputOrder[i] = original[i][2];
        }

        for (int i = 1; i < year.length; i++)
        {
            area[(int) year[i][0]]++;
            year[i][1] = area[(int) year[i][0]];
        }
        String tempArea;
        String tempYearOrder;
        for (int i = 0; i < M; i++)
        {
            tempArea = String.valueOf(year[(int) inputOrder[i]][0]);
            tempYearOrder = String.valueOf(year[(int) inputOrder[i]][1]);
            while (tempArea.length() < 6)
            {
                tempArea = "0" + tempArea;
            }
            while (tempYearOrder.length() < 6)
            {
                tempYearOrder = "0" + tempYearOrder;
            }
            System.out.println(tempArea + tempYearOrder);
        }
    }

}
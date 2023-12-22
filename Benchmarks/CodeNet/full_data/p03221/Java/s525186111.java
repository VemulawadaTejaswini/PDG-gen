import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        final Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        final int M = sc.nextInt();

        final int[][] original = new int[M][3];
        final int[][] year = new int[1000000][2];
        final int[] inputOrder = new int[M];
        final int[] area = new int[N + 1];
        for (int i = 0; i < M; i++)
        {
            original[i][0] = i;
            original[i][1] = sc.nextInt();
            original[i][2] = sc.nextInt();
            year[original[i][2]][0] = original[i][1];
            inputOrder[i] = original[i][2];
        }

        for (int i = 0; i < year.length; i++)
        {
            area[year[i][0]]++;
            year[i][1] = area[year[i][0]];
        }
        String tempArea;
        String tempYearOrder;
        for (int i = 0; i < M; i++)
        {
            tempArea = String.valueOf(year[inputOrder[i]][0]);
            tempYearOrder = String.valueOf(year[inputOrder[i]][1]);
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

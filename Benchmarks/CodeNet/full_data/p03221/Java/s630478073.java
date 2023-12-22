import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        final Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        final int M = sc.nextInt();
        final int[] P = new int[M];
        final int[] Y = new int[M];
        final Map<Integer, List<Integer>> areaToYears = new HashMap<Integer, List<Integer>>();
        List<Integer> tempList;
        for (int i = 0; i < M; i++)
        {
            P[i] = sc.nextInt();
            Y[i] = sc.nextInt();
            if (areaToYears.containsKey(P[i]))
            {
                areaToYears.get(P[i]).add(Y[i]);
            } else
            {
                tempList = new ArrayList<Integer>();
                tempList.add(Y[i]);
                areaToYears.put(P[i], tempList);
            }
        }

        for (final Entry<Integer, List<Integer>> entry : areaToYears.entrySet())
        {
            Collections.sort(entry.getValue());
        }
        String tempArea;
        String tempYearOrder;
        for (int i = 0; i < M; i++)
        {
            tempArea = String.valueOf(P[i]);
            while (tempArea.length() < 6)
            {
                tempArea = "0" + tempArea;
            }
            tempYearOrder = String.valueOf(areaToYears.get(P[i]).indexOf(Y[i]) + 1);
            while (tempYearOrder.length() < 6)
            {
                tempYearOrder = "0" + tempYearOrder;
            }
            System.out.println(tempArea + tempYearOrder);
        }
    }
}

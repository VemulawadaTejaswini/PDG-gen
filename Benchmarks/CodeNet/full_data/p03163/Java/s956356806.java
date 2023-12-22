import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main
{
    public static void main(String[] args)
    {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD
    {
        public void solve(int testNumber, Scanner in, PrintWriter out)
        {
            int N = in.nextInt();
            int W = in.nextInt();
            int values[] = new int[N];
            int weights[] = new int[N];
            for (int i = 0; i < N; i++)
            {
                weights[i] = in.nextInt();
                values[i] = in.nextInt();
            }
            out.print(topDownRecursive(values, weights, W));
        }

        public int topDownRecursive(int values[], int weights[], int W)
        {
            Map<Index, Integer> map = new HashMap<>();
            return topDownRecursiveUtil(values, weights, W, values.length, 0, map);
        }

        public int topDownRecursiveUtil(int values[], int weights[], int remainingWeight, int totalItems, int currentItem, Map<Index, Integer> map)
        {
            if (currentItem >= totalItems || remainingWeight <= 0)
            {
                return 0;
            }
            Index key = new Index();
            key.remainingItems = totalItems - currentItem - 1;
            key.remainingWeight = remainingWeight;

            if (map.containsKey(key))
            {
                return map.get(key);
            }
            int maxValue;
            if (remainingWeight < weights[currentItem])
            {
                maxValue = topDownRecursiveUtil(values, weights, remainingWeight, totalItems, currentItem + 1, map);
            } else
            {
                maxValue = Math.max(values[currentItem] + topDownRecursiveUtil(values, weights, remainingWeight - weights[currentItem], totalItems, currentItem + 1, map),
                                    topDownRecursiveUtil(values, weights, remainingWeight, totalItems, currentItem + 1, map));
            }
            map.put(key, maxValue);
            return maxValue;

        }

    }

    static class Index
    {
        int remainingWeight;
        int remainingItems;

        public boolean equals(Object o)
        {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Index index = (Index) o;

            if (remainingWeight != index.remainingWeight) return false;
            return remainingItems == index.remainingItems;

        }

        public int hashCode()
        {
            int result = remainingWeight;
            result = 31 * result + remainingItems;
            return result;
        }

    }
}


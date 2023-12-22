import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Integer N = input.nextInt();
        String S = input.next();
        char rgb[] = S.toCharArray();

        long startTime = System.currentTimeMillis();

        List<List<Integer>> indexes = get_indexes(rgb);
        List<Integer> rIndexes = indexes.get(0);
        List<Integer> gIndexes = indexes.get(1);
        List<Integer> bIndexes = indexes.get(2);

        long getIndexTime = System.currentTimeMillis();

        long sum = 0;
        int i,j,k;

        for (int r : rIndexes) {
            for (int g : gIndexes) {
                for (int b : bIndexes) {
                    i = (r > g) ? ((g > b) ? b : g) : ((r > b) ? b : r);
                    k = (r > g) ? ((r > b) ? r : b) : ((g > b) ? g : b);
                    if (i != b && k != b) {
                        j = b;
                    } else if (i != r && k != r) {
                        j = r;
                    } else {
                        j = g;
                    }

                    if ((j - i) != (k - j)) {
                        sum++;
                    }
                }
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println(sum);

        System.out.println("getindex:" + (getIndexTime - startTime) + "\nend:" + (endTime - startTime));
    }

    private static List<List<Integer>> get_indexes(char[] str) {
        int i = 0;
        List<Integer> rindexes = new ArrayList<Integer>();
        List<Integer> gindexes = new ArrayList<Integer>();
        List<Integer> bindexes = new ArrayList<Integer>();
        for(char c : str) {
            if (c == 'R') {
                rindexes.add(i++);
            } else if (c == 'G') {
                gindexes.add(i++);
            } else {
                bindexes.add(i++);
            }
        }
        return Arrays.asList(rindexes, gindexes, bindexes);
    }
}

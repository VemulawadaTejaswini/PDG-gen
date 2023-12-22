import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Integer N = input.nextInt();
        String S = input.next();
        char rgb[] = S.toCharArray();
        List<Integer> rIndexes = get_indexes(S, 'R');
        List<Integer> gIndexes = get_indexes(S, 'G');
        List<Integer> bIndexes = get_indexes(S, 'B');
        long sum = 0;
        int i,j,k;

        for (int r : rIndexes) {
            for (int g : gIndexes) {
                for (int b : bIndexes) {
                    i = Math.min(r, Math.min(g,b));
                    k = Math.max(r, Math.max(g,b));
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

        System.out.println(sum);
    }

    private static List<Integer> get_indexes(String str, char c) {
        int i = 0;
        int index;
        List<Integer> indexes = new ArrayList<Integer>();
        for(;;) {
            index = str.indexOf(c, i);
            if (index >= 0) {
                indexes.add(index);
                i = index + 1;
            } else {
                break;
            }
        }
        return indexes;
    }
}
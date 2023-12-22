import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Strings of Impurity
 */
public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            String S = sc.next();
            String T = sc.next();

            @SuppressWarnings("unchecked")
            List<Integer>[] clist = new List[26];
            for (int i = 0; i < 26; i++) {
                clist[i] = new ArrayList<Integer>();
            }

            for (int i = 0; i < S.length(); i++) {
                clist[(int) (S.charAt(i) - 97)].add(i);
            }

            int[][] index = new int[26][];
            for (int i = 0; i < 26; i++) {
                index[i] = clist[i].stream().mapToInt(Integer::intValue).toArray();
            }

            long con = 0;
            int pre = -1;
            for (char c : T.toCharArray()) {
                int[] idx = index[(int) (c - 97)];
                if (idx.length == 0) {
                    System.out.println(-1);
                    return;
                }

                int pos = Arrays.binarySearch(idx, pre + 1);

                int i;
                if (pos >= 0) {
                    i = idx[pos];
                } else {
                    pos = -(pos + 1);
                    if (pos < idx.length) {
                        i = idx[pos];
                    } else {
                        con++;
                        i = idx[0];
                    }
                }

                pre = i;
            }

            System.out.println(con * S.length() + pre + 1);
        }
    }

}

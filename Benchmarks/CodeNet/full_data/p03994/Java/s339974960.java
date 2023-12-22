import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Comparator;
import java.util.List;

public class Main { // Template for CF
    public static class ListComparator implements Comparator<List<Integer>> {

        @Override
        public int compare(List<Integer> l1, List<Integer> l2) {
            for (int i = 0; i < l1.size(); ++i) {
                if (l1.get(i).compareTo(l2.get(i)) != 0) {
                    return l1.get(i).compareTo(l2.get(i));
                }
            }
            return 0;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        String str = f.readLine();
        int k = Integer.parseInt(f.readLine());
        int[] chars = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            if (26 - (str.charAt(i) - 'a') <= k) {
                chars[i] = 0;
                k -= (26 - (str.charAt(i) - 'a'));
            } else {
                chars[i] = str.charAt(i) - 'a';
            }
        }
        int left = k % (26 * str.length());
        int inc = left % 26;
        chars[str.length() - 1] += inc;
        for (int i = 0; i < chars.length; i++) {
            out.print((char) (chars[i] + 'a'));
        }
        out.close();
    }

}

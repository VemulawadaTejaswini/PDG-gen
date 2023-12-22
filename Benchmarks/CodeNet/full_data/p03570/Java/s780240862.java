
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    static Set<Character> odd = new HashSet<>();
    static Set<Character> even = new HashSet<>();
    static Set<Character> odd_tmp = new HashSet<>();
    static Set<Character> even_tmp = new HashSet<>();

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char[] s = scan.nextLine().toCharArray();
        boolean[] abc = new boolean['z' - 'a' + 1];
        for(char tmp : s) {
            abc[tmp - 'a'] = !abc[tmp - 'a'];
        }
        int result = 0;
        for (boolean tmp : abc) {
            if (tmp) {
                result++;
            }
        }
        System.out.println(result > 0 ?result : 1);
    }

    static int[] max_cut(char[] s) {
        boolean[] abc = new boolean['z' - 'a' + 1];
        for(char tmp : s) {
            abc[tmp - 'a'] = !abc[tmp - 'a'];
        }
        for (int i = 0; i < abc.length; i++) {
            if(abc[i]) {
                odd.add((char) ('a' + i));
            }
            else {
                even.add((char) ('a' + i));
            }
        }
        odd_tmp.addAll(odd);
        even_tmp.addAll(even);
        int[] result = new int[]{0, 0};
        for (int i = 0; i < s.length;) {
            int start = i;
            for (int j = i; j < s.length; j++) {
                char tmp = s[j];
                if (even.contains(tmp)) {
                    even.remove(tmp);
                    continue;
                }
                if (odd.contains(tmp)) {
                    odd.remove(tmp);
                    even.add(tmp);
                } else if (odd.isEmpty()) {
                    odd.add(tmp);
                } else {
                    if (result[1] - result[0] < j - start)
                        odd.clear();
                    even.clear();
                    odd.add(tmp);
                }
                i = j;
            }
        }
        return result;
    }
}
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        char[] t = sc.next().toCharArray();

        TreeSet<Integer>[] sets = new TreeSet[26];
        for (int i = 0; i < 26; i++) {
            sets[i] = new TreeSet<>();
        }
        for (int i = 0; i < s.length; i++) {
            sets[s[i] - 'a'].add(i);
        }

        int index = 0;
        int res = 0;
        for (int i = 0; i < t.length; i++) {
            Integer tmp = sets[t[i] - 'a'].ceiling(index);
            if (tmp == null) {
                index = 0;
                res++;
                tmp = sets[t[i] - 'a'].ceiling(index);
                if (tmp == null) {
                    System.out.println("-1");
                    return;
                }
            }
            index = tmp + 1;

        }

        System.out.println(s.length * res + index);

    }
}

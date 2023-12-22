import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] s = new String[N];
        for (int i = 0; i < N ; i++) {
            s[i] = sc.next();
        }
        int M = sc.nextInt();
        String[] t = new String[M];

        for (int i = 0; i < M ; i++) {
            t[i] = sc.next();
        }

        Set<String> set = new HashSet<String>();
        for (String ss : s) {
            set.add(ss);
        }
        for (String ts : t) {
            set.add(ts);
        }

        int max = 0;
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            String word = it.next();
            int sCount = 0;
            for (String sWord : s) {
                if (word.equals(sWord)) {
                    sCount++;
                }
            }
            int tCount = 0;
            for (String tWord : t) {
                if (word.equals(tWord)) {
                    tCount--;
                }
            }
            max = Math.max(max, sCount + tCount);
        }
        System.out.println(max);

    }

}

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        List<Long> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(Long.parseLong(sc.next()));
        }
        Collections.sort(a, Comparator.reverseOrder());
        while(a.size() > 1) {
            long max = a.get(0);
            long mod = 0;
            for (int i = 1; i < a.size(); i++) {
                long temp = max % a.get(i);
                if (temp != 0) {
                    mod = Math.max(mod, temp);
                }
            }
            if (mod == 0) {
                a.remove(0);
            } else {
                a.set(0, mod);
            }
            Collections.sort(a, Comparator.reverseOrder());
        }
        System.out.println(a.get(0));
    }
}
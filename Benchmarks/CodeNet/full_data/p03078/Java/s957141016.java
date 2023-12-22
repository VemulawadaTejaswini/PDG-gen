import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        long x = sc.nextLong();
        long y = sc.nextLong();
        long z = sc.nextLong();
        long k = sc.nextLong();
        ArrayList<Long> aList = new ArrayList<>();
        ArrayList<Long> bList = new ArrayList<>();
        ArrayList<Long> cList = new ArrayList<>();

        for (int i = 0; i < x; i++) {
            aList.add(sc.nextLong());
        }
        aList.sort(Comparator.reverseOrder());

        for (int i = 0; i < y; i++) {
            bList.add(sc.nextLong());
        }
        bList.sort(Comparator.reverseOrder());

        for (int i = 0; i < z; i++) {
            cList.add(sc.nextLong());
        }
        cList.sort(Comparator.reverseOrder());

        sc.close();

        long a, b, c;

        ArrayList<Long> ans = new ArrayList<>();
        long min = 0;

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                for (int l = 0; l < z; l++) {
                    a = aList.get(i);
                    b = bList.get(j);
                    c = cList.get(l);
                    min = Math.min(min, a + b + c);
                    if (ans.size() >= k) {
                        if (min <= a + b + c) {
                            ans.add(a + b + c);
                        }
                    } else {
                        ans.add(a + b + c);
                    }

                }
            }
        }

        ans.sort(Comparator.reverseOrder());

        for (int i = 0; i < k; i++) {
            System.out.println(ans.get(i));
        }
    }
}
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Integer, Person> m = new HashMap<>();

        for (int i = 0; i < n; i++) {
            m.put(i + 1, new Person());
        }

        for (int i = 0; i < n; i++) {
            int q = sc.nextInt();
            for (int j = 0; j < q; j++) {
                int key = sc.nextInt();
                int isHonest = sc.nextInt();
                Person person = m.getOrDefault(key, new Person());
                if (isHonest == 1) {
                    person.isHonest = true;
                }
                if (isHonest == 0) {
                    person.isLier = false;
                }

                m.put(key, person);
            }
        }

        int ans = 0;
        int tmp = 0;
        for (Entry<Integer, Person> e : m.entrySet()) {
            Boolean isH = e.getValue().isHonest;
            Boolean isL = e.getValue().isLier;
            if (null == isH && null == isL) {
                ans++;
            } else if (null == isH && false == isL) {
                tmp++;
            } else if (true == isH && null == isL) {
                ans++;
            } else if (true == isH && false == isL) {
                continue;
            }
        }

        System.out.println(ans + tmp / 2);
    }

    static class Person {
        Boolean isHonest;
        Boolean isLier;

        @Override
        public String toString() {
            return this.isHonest + ":" + this.isLier;
        }
    }
}

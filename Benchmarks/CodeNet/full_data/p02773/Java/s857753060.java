import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] list = new String[n];
        for (int i = 0; i < n; i++) {
            list[i] = sc.next();
        }
        Arrays.sort(list);

        ArrayList<Moji> ans = new ArrayList<>();
        int count = 1;

        for (int i = 1; i < n; i++) {
            if (list[i].equals(list[i - 1])) {
                count++;
            } else {
                ans.add(new Moji(list[i - 1], count));
                count = 1;
            }
            if (i == n - 1) {
                ans.add(new Moji(list[i], count));
            }
        }

        ans.sort((a, b) -> b.count - a.count);
        int max = ans.get(0).count;
        for (Moji v: ans
             ) {
            if (max == v.count) {
                System.out.println(v.value);
            } else {
                return;
            }
        }
    }

    private static class Moji {
        private String value;
        private int count;

        public Moji(String value, int count) {
            this.value = value;
            this.count = count;
        }
    }
}
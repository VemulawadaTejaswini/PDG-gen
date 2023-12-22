import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Work[] list = new Work[n];
        for (int i = 0; i < n; i++) {
            list[i] = new Work(sc.nextLong(), sc.nextLong());
        }
        Arrays.sort(list, ((a, b) -> Math.toIntExact(a.limit - b.limit)));
        long now = 0;
        String ans = "Yes";
        for (int i = 0; i < list.length; i++) {
            if (now + list[i].need <= list[i].limit) {
                now += list[i].need;
            } else {
                ans = "No";
                break;
            }
        }
        System.out.println(ans);
    }

    private static class Work {
        private long need;
        private long limit;

        private Work(long need, long limit) {
            this.need = need;
            this.limit = limit;
        }
    }
}
import java.util.*;

public class Main {

    static List<ban> bans;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int C = scan.nextInt();
        bans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            bans.add(new ban(scan.nextInt() * 2,scan.nextInt() * 2,scan.nextInt()));
        }
        bans.sort(Comparator.comparingInt(x -> x.s));

        for (int i = 1; i <= C; i++) {
            boolean success = func(i);
            if (success) {
                System.out.println(i);
                return;
            }
        }
    }

    private static boolean func(int num) {
        List<tv> tvs = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            tvs.add(new tv(-1, -1));
        }
        for (int i = 0; i < bans.size(); i++) {
            int now = bans.get(i).s;
            int can = bans.get(i).c;
            Optional<tv> tmp = tvs.stream().filter(x -> x.c == -1 || (x.c == can && x.t <= now) || x.t <= now - 1).findAny();
            if(tmp.isPresent()) {
                tv temp = tmp.get();
                temp.t = bans.get(i).t;
                temp.c = can;
            }
            else {
                return false;
            }
        }
        return true;
    }

    static class tv{
        int t;
        int c;
        public tv(int t, int c) {
            this.t = t;
            this.c = c;
        }
    }

    static class ban{
        int s;
        int t;
        int c;
        ban(int s, int t, int c) {
            this.s = s;
            this.t = t;
            this.c = c;
        }
    }
}

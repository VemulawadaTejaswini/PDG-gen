import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        List<Work> work = new ArrayList<>();
//        Work work[] = new Work[n];
        for (int i = 0; i < n; i++) {
            int time = Integer.parseInt(sc.next());
            int limit = Integer.parseInt(sc.next());
            work.add(new Work(time, limit));
        }
        sc.close();
        work.sort(Comparator.comparingInt(x -> x.limit));
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans += work.get(i).time;
            if (ans > work.get(i).limit) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }

    static class Work {
        int time;
        int limit;

        Work(int time, int limit) {
            this.time = time;
            this.limit = limit;
        }
    }
}
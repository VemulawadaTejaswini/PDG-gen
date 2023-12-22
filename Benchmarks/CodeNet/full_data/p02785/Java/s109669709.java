import java.util.*;

class Main {
    final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        int n = sc.nextInt();
        int k = sc.nextInt();
        List<Long> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextLong());
        }
        Collections.sort(list, Collections.reverseOrder());

        long sum = 0;
        for (int i = k; i < n; i++) {
            sum += list.get(i);
        }
        System.out.println(sum);
    }
}

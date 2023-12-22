import java.util.*;

class Main {
    public static void main(String[] args) {
        new Solver().run();
    }
}

class Solver {

    public void run() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        Set<Integer> set = new HashSet<>();
        for (int v : A) {
            if (set.contains(v)) {
                set.remove(v);
            } else {
                set.add(v);
            }
        }

        System.out.println(set.size());

        return;
    }

}
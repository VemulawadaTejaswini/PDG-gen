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
        int[] s = new int[N];

        int sum = 0;
        for (int i = 0; i < N; i++) {
            s[i] = sc.nextInt();
            sum += s[i];
        }

        if (sum % 10 != 0) {
            System.out.println(sum);
            return;
        }

        Arrays.sort(s);
        for (int i = 0; i < N; i++) {
            int cand = sum - s[i];
            if ((cand % 10) != 0) {
                System.out.println(cand);
                return;
            }
        }

        System.out.println(0);
        return;
    }

}
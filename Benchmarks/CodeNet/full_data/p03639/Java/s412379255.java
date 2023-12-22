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
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }

        int[] cnt = new int[3];
        for (int i = 0; i < N; i++) {
            if (a[i] % 4 == 0) cnt[0]++;
            else if (a[i] % 2 == 0) cnt[1]++;
            else cnt[2]++;
        }

        if ( (cnt[0] < cnt[2]) && !((cnt[0] + 1 == cnt[2]) && (cnt[1] == 0)) ) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }

        return;
    }

}
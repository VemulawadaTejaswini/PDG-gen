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
        int x = sc.nextInt();

        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);


        int cnt = 0;
        for (int i = 0; i < N; i++) {
            if (x >= a[i]) {
                x -= a[i];
                cnt++;
            } else {
                break;
            }
        }

        if (x != 0) cnt--;

        System.out.println(Math.max(cnt,0));
        return;
    }

}
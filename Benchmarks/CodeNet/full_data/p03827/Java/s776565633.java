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
        char[] S = sc.next().toCharArray();

        int cnt = 0;
        int max = 0;
        for (char ch: S) {
            if (ch == 'I') {
                cnt++;
                max = Math.max(cnt, max);
            } else {
                cnt--;
            }
        }
        System.out.println(max);

        return;
    }

}
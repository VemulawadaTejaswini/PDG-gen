import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int preT = 0;
        int preX = 0;
        int preY = 0;

        for (int i = 0; i < N; i++) {
            int postT = Integer.parseInt(sc.next());
            int postX = Integer.parseInt(sc.next());
            int postY = Integer.parseInt(sc.next());

            int dt = postT - preT;
            int dist = Math.abs(postX - preX) + Math.abs(postY - preY);
            // 1.目標地点までにかけられる時間の差より目標地点までの距離が長いと移動できない
            // 2.時刻 - 距離　
            if ((dist > dt) || ((dt - dist) % 2 != 0)) {
                System.out.println("No");
                return;
            }

            preT = postT;
            preX = postX;
            preY = postY;
        }
        System.out.println("Yes");
    }
}

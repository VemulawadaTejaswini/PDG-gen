import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    public void run() {
        Scanner sc = new Scanner(System.in);
        // じゃんけんの回数
        int N = sc.nextInt();
        // K回前と同じ手が出せない
        int K = sc.nextInt();
        // グーで買った点数
        int R = sc.nextInt();
        // チョキで勝った点数
        int S = sc.nextInt();
        // パーで勝った点数
        int P = sc.nextInt();
        // じゃんけん出す順
        String[] T = sc.next().split("");

        int point = 0;
        for (int i = 0; i < T.length; i++) {
            if (i < K) {
                if (T[i].equals("r")) {
                    point = point + P;
                } else if (T[i].equals("s")) {
                    point = point + R;
                } else if (T[i].equals("p")) {
                    point = point + S;
                }
            } else {
                if (T[i].equals("r")) {
                    if (T[i - K].equals("r")) {
                        T[i] = "x";
                    } else {
                        point = point + P;
                    }
                } else if (T[i].equals("s")) {
                    if (T[i - K].equals("s")) {
                        T[i] = "x";
                    } else {
                        point = point + R;
                    }
                } else if (T[i].equals("p")) {
                    if (T[i - K].equals("p")) {
                        T[i] = "x";
                    } else {
                        point = point + S;
                    }
                }
            }
        }

        System.out.println(point);
    }
}
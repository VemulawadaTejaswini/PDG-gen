
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// ABC095 at 2018/04/24

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solveC();
    }

    private void solveA() {
        Scanner sc = new Scanner(System.in);
        char[] N = sc.nextLine().toCharArray();
        int result = 700;
        for (char c : N) {
            if ("o".equals(String.valueOf(c))) {
                result += 100;
            }
        }
        System.out.println(result);
    }

    private void solveB() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int cnt = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            list.add(sc.nextInt());
        }
        for (Integer integer : list) {
            X -= integer;
            cnt++;
        }

        Collections.sort(list);
        int min = list.get(0);
        while(min <= X) {
            X -= min;
            cnt++;
        }
        System.out.println(cnt);

    }

    // ABC095 at 2018/04/29
    private void solveC() {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int X = sc.nextInt();
        int Y = sc.nextInt();

        int sum = 0;
        if (C * 2 < A + B) {
            sum += C * 2 * Math.min(X, Y);
            if (Math.max(X, Y) == X) {
                if (C * 2 * (X - Y) <  (X - Y) * A) {
                    sum += C * 2 * (X - Y);
                } else {
                    sum += (X - Y) * A;
                }
            } else {
                if (C * 2 * (Y - X) < (Y - X) * B) {
                    sum += C * 2 * (Y - X);
                } else {
                    sum += (Y - X) * B;
                }
            }
        } else {
            sum += X * A + Y * B;
        }
        System.out.println(sum);
    }

    private void solveD() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(N);
    }

    private void solveE() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(N);
    }

    private void solveF() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(N);
    }

}
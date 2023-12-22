
import java.util.ArrayList;
import java.util.Scanner;

// ABC094 at 2018/04/14

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solveB();
    }

    private void solveA() {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int X = sc.nextInt();
        if ((X - A) < 0) {
            System.out.println("NO");
        } else if (B < (X - A)) {
            System.out.println("NO");
        } else if ((A + B) < X) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }

    private void solveB() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int X = sc.nextInt();
        ArrayList <Integer> list = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            list.add(sc.nextInt());
        }
        int cost1 = 0;
        for (int i = X; i < N + 1; i++) {
            if (list.contains(i)) {
                cost1++;
            }
        }
        int cost2 = 0;
        for (int i = X; 0 < i; i--) {
            if (list.contains(i)) {
                cost2++;
            }
        }
        if (cost1 < cost2) {
            System.out.println(cost1);
        } else {
            System.out.println(cost2);
        }
    }

    private void solveC() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(N);
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
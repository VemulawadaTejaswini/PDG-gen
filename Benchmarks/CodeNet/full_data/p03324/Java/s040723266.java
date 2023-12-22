

import java.util.Scanner;

// ABC100 at 2018/06/16

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solveB();
    }

    private void solveA() {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        if (A > 8 || B > 8) {
            System.out.println(":(");
        } else {
            System.out.println("Yay!");
        }
    }

    private void solveB() {
        Scanner sc = new Scanner(System.in);
        int D = sc.nextInt();
        int N = sc.nextInt();
        if (D == 0) {
            if (N == 100) {
                System.out.println((N + 1));
            } else {
                System.out.println(N);
            }
        } else if (D == 1) {
            if (N == 100) {
                System.out.println((N + 1) * 100);
            } else {
                System.out.println(N * 100);
            }
        } else {
            if (N == 100) {
                System.out.println((N + 1) * 10000);
            } else {
                System.out.println(N * 10000);
            }
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
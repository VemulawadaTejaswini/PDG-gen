
import java.util.ArrayList;
import java.util.Scanner;

// *** ABC060 at 2018/02/19

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solveB();
    }

    private void solveA() {
        Scanner sc = new Scanner(System.in);
        String[] w = sc.nextLine().split(" ");
        String tmp = null;
        for (String c : w) {
            if (tmp == null) {
                tmp = c.substring(c.length() - 1, c.length());
            } else {
                if (tmp.equals(c.substring(0, 1))) {
                    tmp = c.substring(c.length() - 1, c.length());
                } else {
                    System.out.println("NO");
                    return;
                }
            }
        }
        System.out.println("YES");
    }

    private void solveB() {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int tmp = A;
        ArrayList<Integer> used = new ArrayList<>();
        while (true){
            if (tmp % B == C) {
                System.out.println("YES");
                return;
            } else {
                if (used.contains(tmp % B)) {
                    break;
                }
            }
            used.add(tmp % B);
            tmp += A;
        }
        System.out.println("NO");
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
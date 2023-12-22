
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

// *** at 2018/**/**

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solveB();
    }

    private void solveA() {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        if (A + B < 10) {
            System.out.println(A + B);
        } else {
            System.out.println("error");
        }
    }

    private void solveB() {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        List<String> list = Arrays.asList(S.split(""));
        ArrayList<String> used = new ArrayList<>();
        for (String s : list) {
            if (used.contains(s)) {
                System.out.println("no");
                return;
            }
            used.add(s);
        }
        System.out.println("yes");
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
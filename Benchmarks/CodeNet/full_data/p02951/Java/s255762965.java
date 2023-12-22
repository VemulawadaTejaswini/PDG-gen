import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Main main = new Main();

            main.solveA(sc);
            // main.solveB(sc);
            // main.solveC(sc);
            // main.solveD(sc);
            // main.solveE(sc);

        }

    }

    private void solveD(Scanner sc) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); PrintWriter pw = new PrintWriter(System.out)) {} catch (IOException e) {

        }
    }

    private void solveE(Scanner sc) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); PrintWriter pw = new PrintWriter(System.out)) {

        } catch (IOException e) {

        }
    }

    private void solveC(Scanner sc) {

    }

    void solveB(Scanner sc) {

    }

    class SolveB {
    }

    class Edge {
    }

    void solveA(Scanner sc) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(Math.max(c - (a - b), 0));

    }
}

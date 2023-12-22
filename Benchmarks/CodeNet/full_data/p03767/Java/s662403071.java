import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
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
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); PrintWriter pw = new PrintWriter(System.out)) {
        } catch (IOException e) {

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

    void solveA(Scanner sc) {
        int N = sc.nextInt();
        List<Integer> list = new ArrayList<>(N * 3);
        for (int i = 0; i < N * 3; i++) {
            list.add(sc.nextInt());
        }
        java.util.Collections.sort(list);

        long sum = 0;
        for (int i = 0; i < N; i++) {
            list.remove(0);
            list.remove(list.size() - 1);
            sum += list.remove(list.size() - 1);
        }

        System.out.println(sum);

    }
}

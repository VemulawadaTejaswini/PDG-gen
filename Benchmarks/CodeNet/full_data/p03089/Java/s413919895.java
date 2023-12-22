import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        List<Integer> b = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            b.add(scan.nextInt());
        }
        List<Integer> answer = new ArrayList<>();
        while(!b.isEmpty()) {
            int choice = -1;
            for (int i = 1; i <= b.size(); i++) {
                if (i == b.get(i - 1)) {
                    choice = i;
                }
            }
            if (choice == -1) {
                break;
            }
            answer.add(choice);
            b.remove(choice-1);
        }
        if (!b.isEmpty()) {
            System.out.println(-1);
            return;
        }
        for (int i = answer.size(); 1 <= i; i--) {
            System.out.println(answer.get(i-1));
        }

    }
}

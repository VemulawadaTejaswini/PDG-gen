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
        String S = scan.next();
        List<Character> list = new ArrayList<Character>();
        char[] data = S.toCharArray();
        char current = ' ';
        for (int i = 0; i < N; i++) {
            if (current != data[i]) {
                if (current != ' ') {
                    list.add(current);
                }
                current = data[i];

            }
        }
        list.add(current);
        System.out.println(list.size());
    }
}

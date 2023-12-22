import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        String S = scan.next();
        char[] oceros = S.toCharArray();
        List<Pair> pairs = make(oceros);
        long ans = 0;
        long prev = 0;
        for (int i = 0; i < pairs.size(); i++) {
            Pair p = pairs.get(i);
            if (p.value == 'W') {
                ans += prev * p.count;
                continue;
            }
            prev += p.count;
        }
        System.out.println(ans);
    }

    private List<Pair> make(char[] oceros) {
        char current = oceros[0];
        int index = 0;
        int[] summary = new int[oceros.length];
        for (int i = 0; i < oceros.length; i++) {
            if (current != oceros[i]) {
                index += 1;
            }
            summary[index] += 1;
            current = oceros[i];
        }
        List<Pair> result = new ArrayList<>();
        char value = oceros[0];
        for (int i = 0; i < summary.length; i++) {
            if (summary[i] == 0) {
                break;
            }
            Pair p = new Pair();
            p.count = summary[i];
            p.value = value;
            result.add(p);
            value = value == 'W' ? 'B' : 'W';
        }
        return result;
    }

    class Pair {
        char value;
        int count;
    }
}

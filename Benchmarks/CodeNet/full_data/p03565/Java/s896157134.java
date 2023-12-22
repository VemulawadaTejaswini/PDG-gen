import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        String S = scan.next();
        String T = scan.next();
        char[] data = S.toCharArray();
        int length = data.length;
        char[] hint = T. toCharArray();
        int hint_length = hint.length;
        boolean one_found = false;
        for (int i = 0; i < length; i++) {
            if (length <= i+hint_length-1) {
                break;
            }
            boolean found = true;
            for (int j = 0; j < hint_length; j++) {
                if (data[i+j] == '?') {
                    continue;
                }
                if (data[i+j] != hint[j]) {
                    found = false;
                    break;
                }
            }
            if (found) {
                for (int j = 0; j < hint_length; j++) {
                    data[i+j] = hint[j];
                }
                one_found = true;
                break;
            }
        }
        if (!one_found) {
            System.out.println("UNRESTORABLE");
            return;
        }
        for (int i = 0; i < length; i++) {
            if (data[i] == '?') {
                data[i] = 'a';
            }
        }
        System.out.println(data);
    }
}

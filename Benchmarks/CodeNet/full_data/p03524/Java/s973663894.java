import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        String s = scan.next();
        char[] data = s.toCharArray();
        int[] count = new int[3];
        for (int i = 0; i < data.length; i++) {
            count[data[i]-'a'] += 1;
        }
        int number_of_characters = number_of_characters(count);
        if (number_of_characters == 1) {
            if (data.length == 1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            return;
        }
        if (number_of_characters == 2) {
            if (data.length == 2) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            return;
        }
        if (data.length <= 4) {
            System.out.println("YES");
            return;
        }
        Arrays.sort(count);
        if (count[2]-count[0]<= 1) {
            System.out.println("YES");
            return;
        }
        System.out.println("NO");
    }
    private int number_of_characters(int [] count) {
        int number_of_characters = 0;
        for (int i = 0; i < 3; i++) {
            if (0 < count[i]) {
                number_of_characters += 1;
            }
        }
        return number_of_characters;
    }
}

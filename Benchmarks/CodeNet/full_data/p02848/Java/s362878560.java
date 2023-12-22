
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        char[] s = sc.next().toCharArray();

        for (int i = 0; i < s.length; i++) {
            int num = s[i] - 'A';
            s[i] = (char) ((num + N) % 26 + 'A');
            System.out.print(s[i]);
        }

    }
}
import java.util.Scanner;

// A - Next Alphabet
// https://atcoder.jp/contests/abc151/tasks/abc151_a
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char c = scanner.next().charAt(0);
        scanner.close();

        System.out.println((char) (c + 1));
    }
}

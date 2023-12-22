import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            solve(sc);
        }
    }

    static void solve(Scanner sc) {
        char[] s = sc.nextLine().toCharArray();
        for (int i = 0; i < s.length; i+=2) {
            System.out.print(s[i]);
        }
        System.out.println();
    }
}
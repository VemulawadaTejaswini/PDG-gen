import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            solve(sc);
        }
    }

    public static void solve(Scanner sc) {
        char[] a = sc.next().toCharArray();
        int ans = 0;
        for (char b : a) {
            switch (b) {
            case '+':
                ans++;
                break;
            case '-':
                ans--;
                break;
            }
        }
        System.out.println(ans);
    }
}
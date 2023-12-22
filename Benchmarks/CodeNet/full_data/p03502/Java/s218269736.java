import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            solve(sc);
        }
    }

    static void solve(Scanner sc) {
        String n = sc.next();
        char[] ns = n.toCharArray();
        int sum = 0;
        for (char c : ns) {
            sum += c - '0';
        }
        System.out.println(Integer.parseInt(n) % sum == 0 ? "Yes" : "No");
    }
}
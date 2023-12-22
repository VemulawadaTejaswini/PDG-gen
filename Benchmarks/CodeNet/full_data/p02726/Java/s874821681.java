import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Question question = new Question();
        question.solve(sc);
    }

    static class Question {
        public void solve(Scanner sc) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            int[] res = new int[n];
            int t = 0;
            for (int i = 1; i < n + 1; ++i) {
                for (int j = i + 1; j < n + 1; ++j) {
                    t = Math.min(j - i, Math.abs(x - i) + Math.abs(j - y) + 1);
                    res[t]++;
                }
            }
            for (int i = 1; i < n; ++i) {
                System.out.println(res[i]);
            }
        }
    }
}

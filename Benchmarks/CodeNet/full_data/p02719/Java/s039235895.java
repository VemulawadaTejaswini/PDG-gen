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
            int m = sc.nextInt();
            int i = n / m;
            int j = i + 1;
            System.out.println(Math.min(Math.abs(i * m - n), Math.abs(j * m - n)));
        }
    }
}

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
            while(n > 0) {
                if(n % 10 == 7) {
                    System.out.println("Yes");
                    return;
                }
                n /= 10;
            }
            System.out.println("No");
        }
    }
}

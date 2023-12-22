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
            String str = sc.next();
            long sum = 0;
            for(int i = 0; i < n; ++i) {
                for(int j = i + 1; j < n; ++j) {
                    char a = str.charAt(i);
                    char b = str.charAt(j);
                    if(a == b) continue;
                    for(int k = j +  1; k < n; ++k) {
                        if(j - i == k - j) continue;
                        char c = str.charAt(k);
                        if(b == c || a == c) continue;
                        sum++;
                    }
                }
            }
            System.out.println(sum);
        }
    }
}

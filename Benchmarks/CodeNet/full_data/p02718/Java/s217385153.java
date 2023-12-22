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
            int count = 0;
            int[] arr = new int[n]; 

            int sum = 0;
            int i = 0;
            while(n-- > 0) {
                int t = sc.nextInt();
                arr[i++] = t;
                sum += t;
            }
            for(int num : arr) {
                if((double)num >= ((double)sum / (4 * m))) count++;
            }
            System.out.println(count >= m ? "Yes" : "No");
        }
    }
}

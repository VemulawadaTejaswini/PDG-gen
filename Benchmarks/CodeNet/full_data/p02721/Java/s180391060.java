import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Question question = new Question();
        question.solve(sc);
    }

    static class Question {

        int total = 0;

        void backtrack(int[] arr, List<Integer> temp, String str, int day, int k, int c) {
            if(k == temp.size()) {
                for(int num : temp) arr[num]++;
                total++;
                return;
            }
            for(int i = day; i < str.length(); ++i) {
                if(str.charAt(i) == 'o') {
                    temp.add(i);
                    backtrack(arr, temp, str, i + c + 1, k, c);
                    temp.remove(temp.size() - 1);
                }
            }
        }

        public void solve(Scanner sc) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int c = sc.nextInt();
            String str = sc.next();
            int[] arr = new int[n];
            backtrack(arr, new ArrayList<Integer>(), str, 0, k, c);
            for(int i = 0; i < arr.length; ++i) {
                if(arr[i] == total) System.out.println(i + 1);
            }
        }
    }
}

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();

        HashMap<Integer, Integer> students = new HashMap<Integer, Integer>();

        int index = 1;
        while (--N >= 0) {
            int A = s.nextInt();
            students.put(A, index++);
        }

        String answer = students.values().toString();
        answer = answer.replaceAll(", ", " ");

        System.out.println(answer.substring(1, answer.length() - 1));
    }
}
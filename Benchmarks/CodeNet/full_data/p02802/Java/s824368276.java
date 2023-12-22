import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<Integer> problemNumber = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] problem = new int[m];
        String[] answer = new String[m];
        for (int i = 0; i < m; i++) {
            problem[i] = sc.nextInt();
            answer[i] = sc.next();
        }

        int correct = 0;
        int wrong = 0;
        for (int i = 0; i < m; i++) {
            if (answer[i].equals("WA") && !contains(problem[i])) {
                wrong++;
            } else if (answer[i].equals("AC") && !contains(problem[i])) {
                correct++;
                problemNumber.add(problem[i]);
            }
        }
        System.out.println(correct + " " + wrong);
    }

    private static boolean contains(int num) {
        return problemNumber.contains(num);
    }
}
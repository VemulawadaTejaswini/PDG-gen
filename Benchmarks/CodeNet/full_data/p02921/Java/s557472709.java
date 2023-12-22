import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S, T;

        S = in.nextLine();
        T = in.nextLine();

        int correct = 0;
        for (int i = 0; i < T.length(); i++) {
            if (S.charAt(i) == T.charAt(i)) correct++;
        }

        System.out.println(correct);
    }
}
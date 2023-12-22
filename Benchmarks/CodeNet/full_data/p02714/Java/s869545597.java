import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        String S = scanner.nextLine();
        int B_num = 0;
        int R_num = 0;
        int G_num = 0;
        int total = 0;
        for (int i = N - 1; i >= 0; i--) {
            if (S.charAt(i) == 'B') {
                B_num++;
            }
            if (S.charAt(i) == 'R') {
                R_num++;
            }
            if (S.charAt(i) == 'G') {
                G_num++;
            }
        }
        int exc = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (S.charAt(i) == S.charAt(j)) {
                    continue;
                }
                int k = j + (j - i);
                if (k >= N) {
                    break;
                }
                if (S.charAt(j) == S.charAt(k) || S.charAt(i) == S.charAt(k)) {
                    continue;
                }
                exc++;
            }
        }
        System.out.println(B_num * R_num * G_num - exc);
    }
}

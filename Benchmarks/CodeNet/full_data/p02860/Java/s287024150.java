import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner stdIn = new Scanner(System.in);
        int N = stdIn.nextInt();
        String S = stdIn.next();
        String answer = "Yes";

        if (N % 2 != 0) {
            System.out.println("No");
            System.exit(0);
        }

        for (int i = 0; i < N / 2; i++) {
            if (S.charAt(i) != S.charAt(N / 2 + i)) {
                System.out.println("No");
                System.exit(0);
            }
        }

        System.out.println(answer);
    }
}
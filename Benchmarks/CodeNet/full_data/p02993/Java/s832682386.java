import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        byte[] S = scanner.next().getBytes();
        if (S[0] == S[1] || S[1] == S[2] || S[2] == S[3]) {
            System.out.println("Bad");
            return;
        }

        System.out.println("Good");
    }

}

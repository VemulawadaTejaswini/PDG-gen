import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s = scanner.next();
        int sum = 1;
        char prev = s.charAt(0);
        for(int i = 1; i < s.length(); i++) {
            if (prev != s.charAt(i)) {
                sum++;
                prev = s.charAt(i);
            }
        }
        System.out.println(sum);
    }
}
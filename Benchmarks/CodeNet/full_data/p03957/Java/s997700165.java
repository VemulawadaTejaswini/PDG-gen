import java.util.Scanner;

public class Main {
    Scanner sc = new Scanner(System.in);

    void run() {
        String s = sc.next();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'C') {
                for (int j = i + 1; j < s.length(); j++) {
                    if (s.charAt(j) == 'F') {
                        System.out.println("Yes");
                        return;
                    }
                }
            }
        }
        System.out.println("No");
    }

    public static void main(String[] args) {
        new Main().run();
    }
}
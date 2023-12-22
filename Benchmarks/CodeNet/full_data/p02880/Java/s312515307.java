import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());

        boolean result = false;
        if (n <= 81) {
            for (int i = 1; i <= 9 && !result; i++) {
                for (int j = 1; j <= 9 && !result; j++) {
                    if (n == i * j) {
                        result = true;
                    }
                }
            }
        }

        System.out.println(result ? "Yes" : "No");
    }
}
}
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.next();

        int count = 0;

        for (int i = 0; i < s.length() - 3; i++) {
            int current = 0;
            int x = s.charAt(i) - '0';
            if (x % 2 == 0) {
                for (int j = i; j < s.length(); j++) {
                    int a = s.charAt(j) - '0';

                    current = a + current * 10;

                    if (current % 2019 == 0) {
                        count++;
                    }
                }
            }
        }

        System.out.println(count);
    }
}
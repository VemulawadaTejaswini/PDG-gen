import java.io.IOException;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int count = 0;

        sc.next();
        String input = sc.next();

        String[] inputs = input.split(" ");

        long sum = 0;
        for (int i = 0; i < inputs.length; i++) {
            int value = Integer.parseInt(inputs[i]);
            sum += value;
            if (1000000000 < sum) {
                System.out.println("NO");
                sc.close();
                return;
            }
            if (isOddNumber(value)) {
                count++;
            }
        }
        if (isOddNumber(count)) {
            System.out.println("NO");
        } else {

            System.out.println("YES");
        }
        sc.close();
    }

    public static boolean isOddNumber(int i) {
        if (i % 2 == 0) {
            return false;
        }
        return true;
    }
}
import java.io.IOException;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int count = 0;
        sc.next();
        String input = sc.next();

        String[] inputs = input.split(" ");

        for (int i = 0; i < inputs.length; i++) {
            int value = Integer.parseInt(inputs[i]);
            if (isOddNumber(value)) {
                count++;
            }
        }
        System.out.println(!isOddNumber(count));
        sc.close();
    }

    public static boolean isOddNumber(int i) {
        if (i % 2 == 0) {
            return false;
        }
        return true;
    }

}
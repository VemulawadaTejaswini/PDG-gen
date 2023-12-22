import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        String input = scanner.nextLine();
        String[] numbers = input.split(" ");

        int num = Integer.parseInt(numbers[0]);
        int base = Integer.parseInt(numbers[1]);

        double answer = Math.ceil(Math.log((double) num)/Math.log(base));

        if (Math.log((double) num)/Math.log(base) == (int) Math.log((double) num)/Math.log(base)) {
            System.out.println((int)answer + 1);
        } else {
            System.out.println((int)answer);
        }

    }

}
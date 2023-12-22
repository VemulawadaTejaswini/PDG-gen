import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        //500 1000, 5 5
        int result = x / 500;
        result *= 1000;
        int temp = x % 500;

        int temp2 = temp / 5;
        result += temp2 * 5;
        System.out.println(result);



    }
}
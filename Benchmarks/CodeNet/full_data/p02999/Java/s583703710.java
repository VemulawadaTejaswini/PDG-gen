import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] arg) {

        try (Scanner scanner = new Scanner(System.in)){
            String input = scanner.nextLine();
            int[] i = Arrays.stream(input.split(" ")).mapToInt(Integer::parseInt).toArray();
            System.out.println(i[0] >= i[1] ? "10" : "0");
        }

    }
}

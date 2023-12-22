import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        char[] n_array = String.valueOf(n).toCharArray();
        int sum = 0;

        for (char c : n_array) {
            sum += Character.getNumericValue(c);
        }

        System.out.println(n % sum == 0 ? "Yes" : "No");
    }
}
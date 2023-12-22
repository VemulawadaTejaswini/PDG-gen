import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(inputStr(sc), inputStr(sc));
    }

    private static String[] inputStr(Scanner sc, String... delimiter) {
        return sc.nextLine().split(delimiter == null ? " " : delimiter[0]);
    }

    private static boolean solve(String[]... inputs) {
        Arrays.stream(inputs).forEach(System.out::println);
        return true;
    }
}

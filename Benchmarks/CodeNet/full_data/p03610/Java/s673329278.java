import java.io.ByteArrayInputStream;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;
import java.util.jar.Pack200;

public class Main {
    private static String solve(Scanner scanner) {
        String line = scanner.nextLine();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < line.length(); i ++) {
            if (i % 2 == 0) sb.append(line.charAt(i));
        }
        return new String(sb);
    }

    public static void main(String[] args) {
//        tests();

        Scanner scanner = new Scanner(System.in);
        System.out.println(solve(scanner));
    }

    private static String ex1 = "atcoder";
    private static String ex2 = "aaaa";
    private static String ex3 = "z";

    private static void tests() {
        System.out.println(solve(new Scanner(testCaseToInputStream(ex1))));
        System.out.println(solve(new Scanner(testCaseToInputStream(ex2))));
        System.out.println(solve(new Scanner(testCaseToInputStream(ex3))));
    }

    private static ByteArrayInputStream testCaseToInputStream(String ex) {
        try {
            return new ByteArrayInputStream(ex.getBytes("utf-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
    }
}
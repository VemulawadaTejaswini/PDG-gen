package reg.c79.D;

import java.io.ByteArrayInputStream;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    private static String solve(Scanner scanner) {
        long K = Long.parseLong(scanner.nextLine());
        boolean odd = K % 2 == 1;
        long a = K / 2 + 1 + 2 * (odd ? 1 : 0);
        long b = K / 2 + 1 - (odd ? 1 : 0);

        return a + " " + b;
    }

    public static void main(String[] args) {
//        tests();

        Scanner scanner = new Scanner(System.in);
        System.out.print(solve(scanner));
    }

    private static String ex1 = "0";
    private static String ex2 = "1";
    private static String ex3 = "2";
    private static String ex4 = "1234567894848";

    private static void tests() {
        System.out.println(solve(new Scanner(testCaseToInputStream(ex1))));
        System.out.println(solve(new Scanner(testCaseToInputStream(ex2))));
        System.out.println(solve(new Scanner(testCaseToInputStream(ex3))));
        System.out.println(solve(new Scanner(testCaseToInputStream(ex4))));
    }

    private static ByteArrayInputStream testCaseToInputStream(String ex) {
        try {
            return new ByteArrayInputStream(ex.getBytes("utf-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
    }

    private static int[] lineTointNums(String line) {
        String[] numStrs = line.split(" ");
        int[] nums = new int[numStrs.length];
        for (int i = 0; i < nums.length; i ++) {
            nums[i] = Integer.parseInt(numStrs[i]);
        }
        return nums;
    }
}

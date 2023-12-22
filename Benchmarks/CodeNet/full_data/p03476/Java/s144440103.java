import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setOut(new PrintStream(new BufferedOutputStream(System.out)));

        List<Integer> numberList = new ArrayList<>();
        for (int i = 1; i <= 100000; i += 2) {
            if (isPrime(i) && isPrime((i + 1) / 2)) {
                numberList.add(i);
            }
        }
        int[] numbers = numberList.stream().mapToInt(i -> i).toArray();
        // System.out.println(numbers.size());

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int q = Integer.parseInt(reader.readLine());
        for (int i = 0; i < q; i++) {
            String[] words = reader.readLine().split(" ");
            int l = Integer.parseInt(words[0]);
            int r = Integer.parseInt(words[1]);
            int count = count(numbers, r) - count(numbers, l - 1);
            System.out.println(count);
        }
        System.out.flush();
    }

    private static int count(int[] xs, int x) {
        int returnValue = Arrays.binarySearch(xs, x);
        if (returnValue >= 0) {
            return returnValue + 1;
        } else {
            return -returnValue - 1;
        }
    }

    private static boolean isPrime(int x) {
        return BigInteger.valueOf(x).isProbablePrime(100);
    }
}

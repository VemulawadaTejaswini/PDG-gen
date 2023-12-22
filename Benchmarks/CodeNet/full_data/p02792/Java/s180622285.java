import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        init();
        int n = nextInt();
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            String num = Integer.toString(i);
            int a = num.charAt(0) - '0';
            int b = num.charAt(num.length() - 1) - '0';
            int nums = numOfNums(n, b, a);
            ans += nums;
        }

        System.out.println(ans);
    }

    private static int numOfNums(int max, int a, int b) {
        if (a == 0 || b == 0) return 0;
        int maxLength = Integer.toString(max).length();
        int count = 0;
        if (a == b && a <= max) count++;

        for (int length = 2; length < maxLength; length++) {
            count += (int) Math.pow(10, length - 2);
        }
        if (maxLength == 1) return count;

        int pow10 = (int) Math.pow(10, maxLength - 1);
        int min = 0;
        int maxx = (int) Math.pow(10, maxLength - 2) - 1;

        while (min < maxx) {
            int mid = min + (maxx - min) / 2;
            int num = pow10 * a + mid * 10 + b;
            if (num <= max && num + 1 > max) break;
            if (num < max) min = mid + 1;
            if (num > max) maxx = mid - 1;
        }

        int mid = (min + maxx) / 2;
        int num = pow10 * a + mid * 10 + b;
        if (num <= max) count += (min + maxx) / 2 + 1;
        return count;
    }

    //Input Reader
    private static BufferedReader reader;
    private static StringTokenizer tokenizer;

    private static void init() {
        reader = new BufferedReader(new InputStreamReader(System.in));
        tokenizer = new StringTokenizer("");
    }

    private static String next() throws IOException {
        String read;
        while (!tokenizer.hasMoreTokens()) {
            read = reader.readLine();
            if (read == null || read.equals(""))
                return "-1";
            tokenizer = new StringTokenizer(read);
        }

        return tokenizer.nextToken();
    }

    private static int nextInt() throws IOException {
        return Integer.parseInt(next());
    }
}
import java.io.*;
import java.math.*;
import java.util.*;
import java.util.stream.*;

class Main {
    public static void main(String[] args) throws IOException {
        int num = receiveInt();
        int[] arr1 = receiveIntArray(Delimiter.SPACE);
        int[] arr2 = receiveIntArray(Delimiter.SPACE);

        boolean swapFlag = false;
        int ans = 0;
        for (int i = 0; i < num; i++) {
            if (arr1[i] > arr2[i]) {
                swapFlag = true;
                ans += (arr1[i] - arr2[i]) * factorial(num - i - 1);
            } else if (arr1[i] < arr2[i]) {
                if(!swapFlag) {
                    int[] tmp = arr1;
                    arr1 = arr2;
                    arr2 = tmp;
                }
                swapFlag = true;
                ans += (arr1[i] - arr2[i]) * factorial(num - i - 1);
            }

            for (int j = i + 1; j < num; j++) {
                if (arr1[j] > arr1[i])
                    arr1[j]--;
                if (arr2[j] > arr2[i])
                    arr2[j]--;
            }
        }

        println(ans);
        flush();
    }

    // math
    public static int combination(int n, int k) {
        int ans = 1;
        if (n == 0 || k == 0)
            return 1;
        for (int i = 0; i < k; i++) {
            ans *= n - i;
        }
        ans /= factorial(k);
        return ans;
    }

    public static int factorial(int n) {
        int ans = 1;
        for (int i = 1; i <= n; i++)
            ans *= i;
        return ans;
    }

    // 入出力関連
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final PrintWriter pw = new PrintWriter(System.out);

    enum Delimiter {
        NONE(""), SPACE(" "), DOT("\\."), COMMA(",");

        private String regex;

        private Delimiter(String regex) {
            this.regex = regex;
        }

        public String getRegex() {
            return regex;
        }
    }

    static String receive() throws IOException {
        return br.readLine();
    }

    static int receiveInt() throws IOException {
        return Integer.parseInt(br.readLine());
    }

    static char receiveChar() throws IOException {
        return br.readLine().charAt(0);
    }

    static char[] receiveCharArray() throws IOException {
        return br.readLine().toCharArray();
    }

    static int[] receiveIntArray(Delimiter delimiter) throws IOException {
        return Stream.of(br.readLine().split(delimiter.getRegex())).mapToInt(Integer::parseInt).toArray();
    }

    static String[] receiveStringArray(Delimiter delimiter) throws IOException {
        return Stream.of(br.readLine().split(delimiter.getRegex())).toArray(String[]::new);
    }

    static void print(Object obj) {
        pw.print(obj);
    }

    static void println(Object obj) {
        pw.println(obj);
    }

    static void flush() {
        pw.flush();
    }
}
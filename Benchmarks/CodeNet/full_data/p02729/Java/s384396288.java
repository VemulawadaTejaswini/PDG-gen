import java.io.InputStream;
import java.util.*;


public class CFMain {
    public static void main(String[] args) {
        InputReader in = new InputReader(System.in);

        int n = in.readInt();
        int m = in.readInt();

        System.out.println(binomialCoefficient(n, 2) + binomialCoefficient(m, 2));
    }

    private static int binomialCoefficient(int n, int k) {
        int coefficient = 1;

        if (k > n - k) {
            k = n - k;
        }

        for (int i = 0; i < k; ++i) {
            coefficient *= (n - i);
            coefficient /= (i + 1);
        }

        return coefficient;
    }
}


class InputReader {
    private Scanner scanner;

    InputReader(InputStream inputStream) {
        this.scanner = new Scanner(inputStream);
    }

    int readInt() {
        return scanner.nextInt();
    }

    long readLong() {
        return scanner.nextLong();
    }

    String readLine() {
        return scanner.next(); // fixme: has problems with line endings.
    }

    int[] readIntArray(int arrayLength) {
        int[] array = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            array[i] = scanner.nextInt();
        }

        return array;
    }
}
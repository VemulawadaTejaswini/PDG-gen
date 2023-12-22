import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        FastScanner fs = new FastScanner();
        int n = fs.nextInt();
        while (isPrime2(n) == false) {
            n++;
        }
        System.out.println(n);
    }

    public static boolean isPrime2(int n) {
        if (n == 1)
            return false;
        int prime_array[] = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83,
                89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179, 181, 191, 193,
                197, 199, 211, 223, 227, 229, 233, 239, 241, 251, 257, 263, 269, 271, 277, 281, 283, 293, 307, 311, 313,
                317, 331, 337, 347, 349, 353, 359, 367, 373, 379, 383, 389, 397, 401, 409, 419, 421, 431, 433, 439, 443,
                449, 457, 461, 463, 467, 479, 487, 491, 499, 503, 509, 521, 523, 541, 547, 557, 563, 569, 571, 577, 587,
                593, 599, 601, 607, 613, 617, 619, 631, 641, 643, 647, 653, 659, 661, 673, 677, 683, 691, 701, 709, 719,
                727, 733, 739, 743, 751, 757, 761, 769, 773, 787, 797, 809, 811, 821, 823, 827, 829, 839, 853, 857, 859,
                863, 877, 881, 883, 887, 907, 911, 919, 929, 937, 941, 947, 953, 967, 971, 977, 983, 991, 997 };
        for (int i : prime_array) {
            if (n > i && n % i == 0)
                return false;
            else if (n == i)
                return true;
        }
        return true;
    }

    public static int[] intArray(int n, FastScanner fs) {
        int array[] = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = fs.nextInt();
        }
        return array;
    }

    public static long[] longArray(int n, FastScanner fs) {
        long array[] = new long[n];
        for (int i = 0; i < n; i++) {
            array[i] = fs.nextLong();
        }
        return array;
    }

    public static String[] stringArray(int n, FastScanner fs) {
        String array[] = new String[n];
        for (int i = 0; i < n; i++) {
            array[i] = fs.next();
        }
        return array;
    }

    public static void checkArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    public static void checkArray(long[] array) {
        System.out.println(Arrays.toString(array));
    }

    public static void checkArray(String[] array) {
        System.out.println(Arrays.toString(array));
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i]);
            System.out.print(' ');
        }
        System.out.println(array[array.length - 1]);
    }

    public static void printArray(long[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i]);
            System.out.print(' ');
        }
        System.out.println(array[array.length - 1]);
    }

    public static void printArray(String[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i]);
            System.out.print(' ');
        }
        System.out.println(array[array.length - 1]);
    }
}

class FastScanner {
    private final InputStream in = System.in;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;

    private boolean hasNextByte() {
        if (ptr < buflen) {
            return true;
        } else {
            ptr = 0;
            try {
                buflen = in.read(buffer);
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (buflen <= 0) {
                return false;
            }
        }
        return true;
    }

    private int readByte() {
        if (hasNextByte())
            return buffer[ptr++];
        else
            return -1;
    }

    private static boolean isPrintableChar(int c) {
        return 33 <= c && c <= 126;
    }

    public boolean hasNext() {
        while (hasNextByte() && !isPrintableChar(buffer[ptr]))
            ptr++;
        return hasNextByte();
    }

    public String next() {
        if (!hasNext())
            throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while (isPrintableChar(b)) {
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }

    public long nextLong() {
        if (!hasNext())
            throw new NoSuchElementException();
        long n = 0;
        boolean minus = false;
        int b = readByte();
        if (b == '-') {
            minus = true;
            b = readByte();
        }
        if (b < '0' || '9' < b) {
            throw new NumberFormatException();
        }
        while (true) {
            if ('0' <= b && b <= '9') {
                n *= 10;
                n += b - '0';
            } else if (b == -1 || !isPrintableChar(b)) {
                return minus ? -n : n;
            } else {
                throw new NumberFormatException();
            }
            b = readByte();
        }
    }

    public int nextInt() {
        long nl = nextLong();
        if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE)
            throw new NumberFormatException();
        return (int) nl;
    }

    public double nextDouble() {
        return Double.parseDouble(next());
    }
}

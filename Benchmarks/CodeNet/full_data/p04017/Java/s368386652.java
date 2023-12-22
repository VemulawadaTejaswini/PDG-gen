import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] x = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = scanner.nextInt();
        }

        int l = scanner.nextInt();
        int[] right = new int[n];
        int[] left = new int[n];
        for (int i = 0; i < n; i++) {
            right[i] = right(x, i, l);
            left[i] = left(x, i, l);
        }
        int q = scanner.nextInt();
        for (int i = 0; i < q; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            if (a < b) {
                System.out.println(result(right, a - 1, b - 1));
            } else {
                System.out.println(result2(left, a - 1, b - 1));
            }
        }
    }

    static int result(int[] right, int a, int b) {
        if (right[a] >= b) {
            return 1;
        }
        return 1 + result(right, right[a], b);
    }

    static int result2(int[] left, int a, int b) {
        if (left[a] <= b) {
            return 1;
        }
        return 1 + result2(left, left[a], b);
    }

    static int right(int[] x, int from, int l) {
        return binarySearch(from, x.length - 1, x, from, l);
    }

    static int left(int[] x, int from, int l) {
        return binarySearch2(0, from, x, from, l);
    }

    static int binarySearch(int begin, int end, int[] x, int from, int distance) {
        if (begin == end) {
            return begin;
        }
        if (begin + 1 == end) {
            return x[end] - x[from] <= distance ? end : begin;
        }
        int middle = (begin + end) / 2;
        if (x[middle] - x[from] < distance) {
            return binarySearch(middle, end, x, from, distance);
        } else if (x[middle] - x[from] > distance) {
            return binarySearch(begin, middle, x, from, distance);
        } else {
            return middle;
        }
    }

    static int binarySearch2(int begin, int end, int[] x, int from, int distance) {
        if (begin == end) {
            return begin;
        }
        if (begin + 1 == end) {
            return x[from] - x[begin] <= distance ? begin : end;
        }
        int middle = (begin + end) / 2;
        if (x[from] - x[middle] < distance) {
            return binarySearch2(begin, middle, x, from, distance);
        } else if (x[from] - x[middle] > distance) {
            return binarySearch2(middle, end, x, from, distance);
        } else {
            return middle;
        }
    }

}

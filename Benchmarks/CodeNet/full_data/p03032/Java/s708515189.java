import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author KharYusuf
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastReader in = new FastReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DEqueue solver = new DEqueue();
        solver.solve(1, in, out);
        out.close();
    }

    static class DEqueue {
        public void solve(int testNumber, FastReader s, PrintWriter w) {
            int n = s.nextInt(), k = s.nextInt(), a[] = new int[n], ans = 0;
            for (int i = 0; i < n; i++) a[i] = s.nextInt();
            for (int i = 0; i <= Math.min(n, k); i++) {
                for (int j = 0; i + j <= Math.min(n, k); j++) {
                    int curans = 0, remove = 0, num[] = new int[i + j], cur = 0;
                    for (int m = 0; m < i; m++) {
                        curans += a[m];
                        num[cur++] = a[m];
                    }
                    for (int m = 0; m < j; m++) {
                        curans += a[n - m - 1];
                        num[cur++] = a[n - m - 1];
                    }
                    func.sort(num);
                    for (int m = 0; m < cur && m < k - cur && num[m] < 0; m++) remove += num[m];
                    ans = Math.max(ans, curans - remove);
                }
            }
            w.println(ans);
        }

    }

    static class FastReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
        private FastReader.SpaceCharFilter filter;

        public FastReader(InputStream stream) {
            this.stream = stream;
        }

        public int read() {

            if (numChars == -1)
                throw new InputMismatchException();

            if (curChar >= numChars) {

                curChar = 0;

                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }

                if (numChars <= 0)
                    return -1;
            }

            return buf[curChar++];
        }

        public int nextInt() {

            int c = read();

            while (isSpaceChar(c))
                c = read();

            int sgn = 1;

            if (c == '-') {
                sgn = -1;
                c = read();
            }

            int res = 0;

            do {
                if (c < '0' || c > '9')
                    throw new InputMismatchException();

                res *= 10;
                res += c - '0';
                c = read();
            }
            while (!isSpaceChar(c));

            return res * sgn;
        }

        public boolean isSpaceChar(int c) {

            if (filter != null)
                return filter.isSpaceChar(c);

            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }

    static class func {
        public static void merge(int[] arr, int l, int m, int r) {
            int i, j, k;
            int n1 = m - l + 1;
            int n2 = r - m;

            /* create temp arrays */
            int L[] = new int[n1];
            int R[] = new int[n2];

        /* Copy data to temp arrays L[]
        and R[] */
            for (i = 0; i < n1; i++)
                L[i] = arr[l + i];
            for (j = 0; j < n2; j++)
                R[j] = arr[m + 1 + j];

        /* Merge the temp arrays back into
        arr[l..r]*/
            i = 0;
            j = 0;
            k = l;
            while (i < n1 && j < n2) {
                if (L[i] <= R[j]) {
                    arr[k] = L[i];
                    i++;
                } else {
                    arr[k] = R[j];
                    j++;
                }
                k++;
            }

        /* Copy the remaining elements of
        L[], if there are any */
            while (i < n1) {
                arr[k] = L[i];
                i++;
                k++;
            }

        /* Copy the remaining elements of
        R[], if there are any */
            while (j < n2) {
                arr[k] = R[j];
                j++;
                k++;
            }
        }

        public static void sort(int arr[]) {
            int curr_size;
            int n = arr.length;
            // For picking starting index of
            // left subarray to be merged
            int left_start;


            // Merge subarrays in bottom up
            // manner. First merge subarrays
            // of size 1 to create sorted
            // subarrays of size 2, then merge
            // subarrays of size 2 to create
            // sorted subarrays of size 4, and
            // so on.
            for (curr_size = 1; curr_size <= n - 1;
                 curr_size = 2 * curr_size) {

                // Pick starting point of different
                // subarrays of current size
                for (left_start = 0; left_start < n - 1;
                     left_start += 2 * curr_size) {
                    // Find ending point of left
                    // subarray. mid+1 is starting
                    // point of right
                    int mid = left_start + curr_size - 1;

                    int right_end = Math.min(left_start
                            + 2 * curr_size - 1, n - 1);

                    // Merge Subarrays arr[left_start...mid]
                    // & arr[mid+1...right_end]
                    merge(arr, left_start, mid, right_end);
                }
            }
        }

    }
}


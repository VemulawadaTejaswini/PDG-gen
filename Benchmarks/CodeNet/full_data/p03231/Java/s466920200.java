import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.*;

class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Task solver = new Task();
        solver.solve(in, out);
        out.close();
    }

    static class Task {
        int N, M;
        String S, T;

        int gcd(int a, int b) {
            if (b == 0) {
                return a;
            } else {
                return gcd(b, a % b);
            }
        }

        void solve(InputReader in, PrintWriter out) {
            N = in.nextInt();
            M = in.nextInt();
            S = in.next();
            T = in.next();

            if (N == M) {
                if (S.equals(T)) {
                    out.println(N);
                } else {
                    out.println(-1);
                }
            } else {
                int shorterLen, longerLen;
                String shorterStr, longerStr;
                if (N > M) {
                    shorterLen = M;
                    longerLen = N;
                    shorterStr = T;
                    longerStr = S;
                } else {
                    shorterLen = N;
                    longerLen = M;
                    shorterStr = S;
                    longerStr = T;
                }

                if (longerLen % shorterLen == 0) {
                    StringBuilder partialStr = new StringBuilder();
                    for (int i = 0; i < longerLen; i += longerLen / shorterLen) {
                        partialStr.append(longerStr.charAt(i));
                    }
                    if (partialStr.toString().equals(shorterStr)) {
                        out.println(longerLen);
                    } else {
                        out.println(-1);
                    }
                } else {
                    out.println((longerLen / gcd(longerLen, shorterLen)) * shorterLen);
                }
            }
        }
    }

    static class InputReader {
        BufferedReader reader;
        StringTokenizer tokenizer;

        InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream));
            tokenizer = null;
        }

        String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        int nextInt() { return Integer.parseInt(next()); }

        int[] nextIntArray(int n) {
        	int[] arr = new int[n];
        	for (int i = 0; i < n; ++i) {
        		arr[i] = nextInt();
        	}
        	return arr;
        }
    }
}

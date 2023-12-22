    import java.io.*;
    import java.util.*;

    public class Main {
        static boolean col[];
        private static void solver(InputReader sc, PrintWriter out) {
            int k = sc.nextInt();
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i=0;i<n;i++)arr[i] = sc.nextInt();
            long sum =arr[1]-arr[0];
            for(int i=1;i+1<n;i++){
                if(arr[i+1]-arr[i] > k-arr[i+1]){
                    sum += k-arr[i+1];
                    break;
                }
                else
                    sum += arr[i+1]-arr[i];
            }
            out.println(sum);
        }
        public static void main(String[] args) {
            InputStream inputStream = System.in;
            OutputStream outputStream = System.out;
            InputReader in = new InputReader(inputStream);
            PrintWriter out = new PrintWriter(outputStream);
            solver(in, out);
            out.close();
        }
        static class InputReader {
            public BufferedReader reader;
            public StringTokenizer tokenizer;

            public InputReader(InputStream stream) {
                reader = new BufferedReader(new InputStreamReader(stream), 32768);
                tokenizer = null;
            }

            public String next() {
                while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                    try {
                        tokenizer = new StringTokenizer(reader.readLine());
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
                return tokenizer.nextToken();
            }

            public int nextInt() {
                return Integer.parseInt(next());
            }
            public long nextLong() {
                return Long.parseLong(next());
            }
        }
    }

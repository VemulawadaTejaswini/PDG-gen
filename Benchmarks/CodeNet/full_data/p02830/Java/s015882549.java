    import java.io.*;
    import java.util.*;
    import java.util.LinkedList;

    public class Main {

        public static void main(String[] args) throws IOException {
            InputStream inputStream = System.in;
            OutputStream outputStream = System.out;
            InputReader in = new InputReader(inputStream);
            InputReader.OutputWriter out = new InputReader.OutputWriter(outputStream);
            BufferedReader reader = new BufferedReader(new InputReader(System.in));

            int n = in.nextInt();
            String s = in.next();
            String t = in.next();
            for (int i = 0; i < n; i++) {
                out.print(s.charAt(i));
                out.print(t.charAt(i));
            }
            out.println();
            out.flush();
        }
        private static int toDecimal(String s) {
            int ans = 0;
            int power = s.length() - 1;
            for (char c : s.toCharArray()) {
                ans = ans + (c-'0')*(1 << power);
                power--;
            }
            return ans;
        }
        private static int numberOfOnes(String s) {
            int num = 0;
            for(char c : s.toCharArray()) {
                if(c == '1') num++;
            }
            return num;
        }
        private static void print(char [] c, int middle, InputReader.OutputWriter out) {
            for (int j = 0; j <=middle; j++) {
                out.print(c[j]);
            }
            for (int i = middle - 1; i >=0; i--) {
                out.print(c[i]);
            }
            out.println();
        }
        private static void plusOne(char [] c) {
            int transfer = 0;
            int middle = c.length/2;
            for (int i = middle; i >=0 ; i--) {
                if(c[i]!='9') {
                    if(transfer == 1) {
                        c[i]++;
                    }
                    break;
                }
                if(c[i] == '9') {
                    if(transfer == 1) {
                        c[i] = '0';
                        transfer = 1;
                    }
                    else {
                        c[i] = '0';
                        transfer = 1;
                    }
                }
            }
        }
        private static boolean isPalindrome(String s) {
            int i = 0;
            int j = s.length() - 1;
            while (i<=j) {
                if(s.charAt(i++)!=s.charAt(j--)) return false;
            }
            return true;
        }
        static boolean rightShift(char [] c, String a, String b, List<Integer> indexes) {
            char next = c[0];
            for (int i = 0; i < c.length; i++) {
                if(i!=c.length -1) {
                    char temp = c[i+1];
                    c[i + 1] = next;
                    next = temp;
                }
                else {
                    c[0] = next;
                }
            }

            char [] cc = b.toCharArray();
            int index = 0;
            for (int i = 0; i < cc.length; i++) {
                if(i == indexes.get(index)) {
                    cc[i] = c[index];
                    index++;
                }
                if(index == indexes.size()) break;
            }

            b = new String(cc);
            return a.equals(b);
        }
    }

    class InputReader extends BufferedReader {
        StringTokenizer tokenizer;

        public InputReader(InputStream inputStream) {
            super(new InputStreamReader(inputStream), 32768);
        }

        public InputReader(String filename) {
            super(new InputStreamReader(Thread.currentThread().getContextClassLoader().getResourceAsStream(filename)));
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(readLine());
                } catch (IOException e) {
                    throw new RuntimeException();
                }
            }
            return tokenizer.nextToken();
        }

        public Integer nextInt() {
            return Integer.valueOf(next());
        }
        public Long nextLong() {
            return  Long.valueOf(next());
        }
        public Double nextDouble () {
            return Double.valueOf(next());
        }


        static class OutputWriter extends PrintWriter {
            public OutputWriter(OutputStream outputStream) {
                super(outputStream);
            }

            public OutputWriter(Writer writer) {
                super(writer);
            }

            public OutputWriter(String filename) throws FileNotFoundException {
                super(filename);
            }

            public void close() {
                super.close();
            }
        }
    }

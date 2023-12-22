import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));

        int n = in.nextInt();
//        long[] num755 = new long[9];
//        long[] preS = new long[9];
//        for (int i = 3; i < 9; i++) {
//            num755[i] = (long) (Math.pow(3, i) - 3 * Math.pow(2, i) + 3);
//            preS[i] = num755[i] + preS[i - 1];
//        }
//        System.out.println(Arrays.toString(preS));

        int c = 0;
        for (int i=1; i<=9; i++) {
            int sz = (int) Math.pow(3, i);
            for (int j=0; j<sz; j++) {
                String str = Integer.toString(j, 3);
                StringBuilder sb = new StringBuilder(str);
                for (int k=0; k<str.length(); k++) {
                    if (str.charAt(k) == '0') {
                        sb.replace(k, k + 1, "3");
                    } else if (str.charAt(k) == '1') {
                        sb.replace(k, k + 1, "5");
                    } else {
                        sb.replace(k, k + 1, "7");
                    }
                }
                for (int k=0; k<i - str.length(); k++) {
                    sb.insert(0, '3');
                }
                if (sb.indexOf("3") != -1 && sb.indexOf("5") != -1 && sb.indexOf("7") != -1 &&
                        Integer.parseInt(sb.toString()) <= n) {
                    c++;
                }
            }
        }
        out.println(c);

        out.close();
        //INT OVERFLOW -> USE LONG
        //ARR OUT OF BOUNDS
    }

    static class Scanner {
        StringTokenizer st;
        BufferedReader br;

        public Scanner(InputStream s) {
            br = new BufferedReader(new InputStreamReader(s));
        }

        public Scanner(String s) {
            try {
                br = new BufferedReader(new FileReader(s));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        public String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }

        public int[] nextIntArray(int n) {
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = nextInt();
            }
            return arr;
        }

        public double[] nextDoubleArray(int n) {
            double[] arr = new double[n];
            for (int i = 0; i < n; i++) {
                arr[i] = nextDouble();
            }
            return arr;
        }

        public long[] nextLongArray(int n) {
            long[] arr = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = nextLong();
            }
            return arr;
        }

        public char[] nextCharArray(int n) {
            char[] arr = nextLine().trim().replaceAll("\\s", "").toCharArray();
            return arr;
        }

        public String[] nextStringArray(int n) {
            String[] arr = new String[n];
            for (int i = 0; i < n; i++) {
                arr[i] = next();
            }
            return arr;
        }
    }
}

//    int numPlaces = (int) Math.floor(Math.log10(n)) + 1;
//        if (numPlaces <= 2) {
//                out.println(0);
//                } else {
//                long res = 0;
//                long[] num755 = new long[8];
//                long[] preS = new long[8];
//                for (int i=3; i<8; i++) {
//        num755[i] = (long) (Math.pow(3, i) - 3 * Math.pow(2, i) + 3);
//        preS[i] = num755[i] + preS[i - 1];
//        }
//
//        for (int i=0; i<=numPlaces - 3; i++) {
//        int cur = numPlaces - 1 - i;
//        if (cur == 2) {
//        int temp = n % 1000;
//        if (temp >= 357 && temp <= 375) {
//        res += 1;
//        } else if (temp <= 537) {
//        res += 2;
//        } else if (temp <= 573) {
//        res += 3;
//        } else if (temp <= 735) {
//        res += 4;
//        } else if (temp <= 753) {
//        res += 5;
//        } else {
//        res += 5;
//        }
//        break;
//        }
//
//        res += preS[cur];
//        int num = n / (int) Math.pow(10, cur) % 10;
//        if (num <= 2) {
//        break;
//        } else if (num == 3) {
//        continue;
//        } else if (num == 4) {
//        res += preS[cur];
//        break;
//        } else if (num == 5) {
//        res += preS[cur];
//        } else if (num == 6) {
//        res += preS[cur] * 2;
//        break;
//        } else if (num == 7) {
//        res += preS[cur] * 2;
//        } else if (num >= 8) {
//        res += preS[cur] * 3;
//        break;
//        }
//        }
//
//        out.println(res);
//        }

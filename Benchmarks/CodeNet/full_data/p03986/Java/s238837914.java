import java.io.*;

public class Main {
    public static void main(String[] args) {
        long N = (long)Math.pow(10, 10000);
        long n = N;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            String buf = in.readLine();
            StringBuilder sb = new StringBuilder(buf);
            for (;n > 0; --n) {
                boolean found = false;
                int len = sb.length();
                for (int i = 0; i < len - 1; ++i) {
                    if (sb.charAt(i) == 'S') {
                        int j;
                        for (j = i + 1; j < len && sb.charAt(j) == '.'; ++j) {
                        }
                        if (j < len && sb.charAt(j) == 'T') {
                            sb.setCharAt(i, '.');
                            sb.setCharAt(j, '.');
                            found = true;
                            break;
                        }
                    }
                }
                if (!found) {
                    break;
                }
            }
            int len = sb.length();
            for (int i = 0; i < sb.length(); ++i) {
                if (sb.charAt(i) == '.') {
                    --len;
                }
            }
            System.out.println(len);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
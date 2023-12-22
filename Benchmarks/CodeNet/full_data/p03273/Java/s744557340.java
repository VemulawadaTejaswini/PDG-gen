import java.io.*;
import java.util.*;


public class Main {

    public static void main(String[] args) throws IOException {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        InputReader.OutputWriter out = new InputReader.OutputWriter(outputStream);


        int n = in.nextInt();
        int m = in.nextInt();
        char[][] c = new char[n][m];
        for (int i = 0; i < n; i++) {
            c[i] = in.next().toCharArray();
        }
        for (int i = 0; i < n; i++) {
            boolean found = false;
            for (int j = 0; j < m; j++) {
                if(c[i][j] == '#') {
                    found = true;
                    break;
                }
            }
            if(!found) {
                for (int j = 0; j < m; j++) {
                    c[i][j] = '1';
                }
            }
        }

        for (int i = 0; i < m; i++) {
            boolean found = false;
            for (int j = 0; j < n; j++) {
                if(c[j][i] == '#') {
                    found = true;
                    break;
                }
            }
            if(!found) {
                for (int j = 0; j < n; j++) {
                    c[j][i] = '1';
                }
            }
        }

        for (int i = 0; i < n; i++) {
            boolean printed = false;
            for (int j = 0; j < m; j++) {
                if(c[i][j]!='1') {
                    printed = true;
                    out.print(c[i][j]);
                }
            }
            if(printed)out.println();
        }


        out.flush();

    }
    static boolean check(char [] ca,char [] cb) {
        for (char c = 'a';c<='z';c++) {
            HashSet<Character> set = new HashSet<>();
            for (int i = 0; i < ca.length; i++) {
                if(ca[i] == c) {
                    set.add(cb[i]);
                }
                if(set.size() > 1) {
                    return false;
                }
            }
        }
        return  true;
    }
}

class Envelope {
    private int width;
    private int height;

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public Envelope(int width,int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return width + " " + height;
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

    public Integer nextInt() {return Integer.valueOf(next());}
    public Long nextLong() {return  Long.valueOf(next());}
    public Double nextDouble() {return Double.valueOf(next());}

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
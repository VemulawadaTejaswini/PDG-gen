import java.io.*;
import java.math.*;
import java.util.*;
import java.util.stream.*;

class Main{
    public static void main(String[] args) throws IOException {
        int rows = receiveInt();
        int cols = receiveInt();
        int goal = receiveInt();

        int big = rows > cols ? rows : cols;
        int small = rows + cols - big;

        int ans = 0;
        for(int i = 0; i < big; i++) {
            goal -= big;
            ans++;
            if(goal <= 0) break;
        }
        
        println(ans);
        flush();
    }



    // 入出力関連
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final PrintWriter pw = new PrintWriter(System.out);
    enum Delimiter {
        NONE(""),
        SPACE(" "),
        DOT("\\."),
        COMMA(",");

        private String regex;
        private Delimiter(String regex) {
            this.regex = regex;
        }
        public String getRegex() { return regex; }
    }

    static String receive() throws IOException { return br.readLine(); }
    static int receiveInt() throws IOException { return Integer.parseInt(br.readLine()); }
    static char receiveChar() throws IOException { return  br.readLine().charAt(0); }
    static char[] receiveCharArray() throws IOException { return  br.readLine().toCharArray(); }
    static int[] receiveIntArray(Delimiter delimiter) throws IOException {
        return Stream.of(br.readLine().split(delimiter.getRegex())).mapToInt(Integer::parseInt).toArray();
    }
    static String[] receiveStringArray(Delimiter delimiter) throws IOException {
        return Stream.of(br.readLine().split(delimiter.getRegex())).toArray(String[]::new);
    }

    static void print(Object obj) { pw.print(obj); }
    static void println(Object obj) { pw.println(obj); }
    static void flush() { pw.flush(); }
}
import java.io.*;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader r =
            new BufferedReader(new InputStreamReader(System.in), 1);
        String s = r.readLine();        // 文字列の入力
        if (s.startsWith("YAKINIKU"))
            System.out.println("Yes");
        else
           System.out.println("No");
    }
}
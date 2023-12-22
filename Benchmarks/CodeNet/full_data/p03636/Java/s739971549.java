import java.io.*;
public class I18N {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        System.out.println(s.substring(0, 1) + (s.length() - 2) + s.substring(s.length() - 1, s.length()));
    }
}
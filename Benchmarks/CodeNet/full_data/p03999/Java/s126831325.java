
import java.io.*;
import java.util.*;
//import java.util.stream.*;;
//import java.math.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Scanner sc = new Scanner(System.in);
        long last_add = 0;
        String s = br.readLine();
        long sum = Integer.parseInt(s);
        for (int i = 0; i < s.length(); i++) {
            if (i < s.length() - 1) {
                sum += Integer.parseInt(s.substring(0, i + 1)) + Integer.parseInt(s.substring(i + 1, s.length()));
            }
            last_add += Integer.parseInt(s.substring(i, i + 1));
        }
        System.out.println(sum + last_add);
        bw.flush();
    }
}

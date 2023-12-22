
import java.io.*;
import java.util.*;
//import java.util.stream.*;
//import java.math.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        int x = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'I') {
                x++;
                if (x > max) {
                    max = x;
                }
            } else {
                x--;
            }
        }
        System.out.println(max > 0 ? max : "0");
        bw.flush();
    }
}

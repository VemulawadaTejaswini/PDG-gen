
import java.io.*;
import java.util.*;
//import java.util.stream.*;
//import java.math.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Scanner sc = new Scanner(System.in);
        int s = 0, e = 0;
        String str = br.readLine();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'A' && i == 0) {
                s = i;
            }
            if (str.charAt(i) == 'Z' && i != 0) {
                e = i;
                break;
            }
        }
        System.out.println(e - s + 1);
        bw.flush();
    }
}

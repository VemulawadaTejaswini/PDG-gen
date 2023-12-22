
import java.io.*;
import java.util.*;
//import java.util.stream.*;
//import java.math.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long x = sc.nextLong();
        long num = 0;
        if (a % x == 0) {
            num = Math.abs((a / x) - (b / x)) + 1;
        } else {
            num = Math.abs((a / x) - (b / x));
        }
        System.out.println(num);
        bw.flush();
    }
}

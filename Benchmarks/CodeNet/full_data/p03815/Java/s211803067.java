
import java.io.*;
import java.util.*;
//import java.util.stream.*;
//import java.math.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        long move = 0;
        if (num <= 6) {
            move = 1;
        } else if (num <= 11) {
            move = 2;
        } else {
            move = (num / 11) * 2 + 1;
        }
        System.out.println(move);
        bw.flush();
    }
}

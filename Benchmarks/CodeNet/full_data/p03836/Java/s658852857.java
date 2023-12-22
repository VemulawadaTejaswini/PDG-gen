
import java.io.*;
import java.util.*;
//import java.util.stream.*;
//import java.math.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Scanner sc = new Scanner(System.in);
        int sx, sy, tx, ty;
        sx = sc.nextInt();
        sy = sc.nextInt();
        tx = sc.nextInt();
        ty = sc.nextInt();
        String s = "";
        int dx = Math.abs(tx - sx);
        int dy = Math.abs(ty - sy);
        for (int i = 1; i <= 4; i++) {
            if (i == 3) {
                s += "LU";
            }
            if (i == 4) {
                s += "RD";
            }
            for (int j = 0; j < dy; j++) {
                if (i == 1 || i == 3) {
                    s += "U";
                } else {
                    s += "D";
                }
            }
            for (int j = 0; j < dx; j++) {
                if (i == 1 || i == 3) {
                    s += "R";
                } else {
                    s += "L";
                }
            }
            if (i == 3) {
                s += "RD";
            }
            if (i == 4) {
                s += "LU";
            }
        }
        System.out.println(s);
        bw.flush();
    }
}

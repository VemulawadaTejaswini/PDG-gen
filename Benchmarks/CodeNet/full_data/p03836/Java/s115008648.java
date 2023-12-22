import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashSet;
import java.lang.Integer;
import java.lang.StringBuilder;
import java.lang.Math;

public class Main {

    public static ArrayList<String> calc(int sx, int sy, int tx, int ty) {
        ArrayList<String> result = new ArrayList<String>();

        int up = 0;
        while (sy + up < ty) {
            result.add("U");
            up++;
        }

        int right = 0;
        while (sx + right < tx) {
            result.add("R");
            right++;
        }

        while (up > 0) {
            result.add("D");
            up--;
        }
        while (right > 0) {
            result.add("L");
            right--;
        }

        // second run!
        right--;
        result.add("L");

        while (sy + up < ty + 1) {
            result.add("U");
            up++;
        }

        while (sx + right < tx) {
            result.add("R");
            right++;
        }

        up--;
        result.add("D");

        right++;
        result.add("R");

        while (up > -1) {
            result.add("D");
            up--;
        }
        while (right > 0) {
            result.add("L");
            right--;
        }

        result.add("U");
        up++;

        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sx = in.nextInt();
        int sy = in.nextInt();
        int tx = in.nextInt();
        int ty = in.nextInt();

        ArrayList<String> result = calc(sx, sy, tx, ty);

        for (String s : result) {
            System.out.print(s);
        }
        System.out.println("");
    }
}
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int f = Integer.parseInt(str.substring(0, 2)), t = Integer.parseInt(str.substring(2));
        if (in(f, 1, 12)) {
            System.out.println(in(t, 1, 12) ? "AMBIGUOUS" : "MMYY");
        } else {
            System.out.println(in(t, 1, 12) ? "YYMM" : "NA");
        }
    }

    public static boolean in(int value, int start, int end) {
        return start <= value && value <= end;
    }
}

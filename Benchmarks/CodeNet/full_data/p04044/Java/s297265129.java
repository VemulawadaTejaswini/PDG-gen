import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Solver().solve(new Scanner(System.in));
//        new Solver().solve(new Scanner(ex));
    }

    private static final String ex = "3 3\n" +
            "dxx\n" +
            "axx\n" +
            "cxx";
}

class Solver {
    Solver() {}

    void solve(Scanner scanner) {
        int[] split = splitInt(scanner.nextLine());
        int N = split[0];
        int L = split[1];

        List<String> strs = new ArrayList<>();
        for (int i = 0; i < N; i ++) {
            strs.add(scanner.nextLine());
        }

        Collections.sort(strs);

        System.out.println(String.join("", strs));
    }

    private int[] splitInt(String s) {
        String[] split = s.split(" ");
        int[] splitInt = new int[split.length];
        for (int i = 0; i < split.length; i ++) {
            splitInt[i] = Integer.parseInt(split[i]);
        }
        return splitInt;
    }
}

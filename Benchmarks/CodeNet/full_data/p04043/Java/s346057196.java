import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Solver().solve(new Scanner(System.in));
//        new Solver().solve(new Scanner(ex));
    }

    private static final String ex = "7 7 5";
}

class Solver {
    Solver() {}

    void solve(Scanner scanner) {
        String[] split = scanner.nextLine().split(" ");
        int count5 = 0;
        int count7 = 0;
        for (int i = 0; i < split.length; i ++) {
            if (split[i].equals("5")) count5 ++;
            if (split[i].equals("7")) count7 ++;
        }

        if (count5 == 2 && count7 == 1) System.out.println("YES");
        else System.out.println("NO");
    }
}

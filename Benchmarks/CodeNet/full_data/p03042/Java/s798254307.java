import java.util.Scanner;

public class Main {

    void solve() {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();

        String part1 = S.substring(0, 2);
        String part2 = S.substring(2);

        int num1 = Integer.parseInt(part1);
        int num2 = Integer.parseInt(part2);

        if ((1 <= num1 && num1 <= 12) && (1 <= num2 && num2 <= 12)) {
            System.out.print("AMBIGUOUS");
        }
        else if (!(1 <= num1 && num1 <= 12) && (1 <= num2 && num2 <= 12)) {
            System.out.print("YYMM");
        }
        else if ((1 <= num1 && num1 <= 12) && !(1 <= num2 && num2 <= 12)) {
            System.out.print("MMYY");
        }
        else {
            System.out.print("NA");
        }
    }

    // Main
    public static void main(String[] args) {
        new Main().solve();
    }
}
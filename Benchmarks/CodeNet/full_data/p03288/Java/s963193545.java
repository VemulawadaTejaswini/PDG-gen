import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int r;
        try(Scanner cin = new Scanner(System.in)) {
            r = cin.nextInt();
        }
        String contest = r >= 2800  ? "AGC" : r >= 1200 ? "ARC" : "ABC";
        System.out.println(contest);
    }

}
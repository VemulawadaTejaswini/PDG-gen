import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        int x = a / 100;
        int y = a % 100;

        boolean YYMM = MMJudge(y);
        boolean MMYY = MMJudge(x);

        if (YYMM == true && MMYY == true) {
            System.out.println("AMBIGUOUS");
        }
        if (YYMM == true && MMYY == false) {
            System.out.println("YYMM");
        }
        if (YYMM == false && MMYY == true) {
            System.out.println("MMYY");
        }
        if (YYMM == false && MMYY == false) {
            System.out.println("NA");
        }

        sc.close();

    }

    public static boolean MMJudge(int a) {
        if (1 <= a && a <= 12) {
            return true;
        } else {
            return false;
        }
    }
}
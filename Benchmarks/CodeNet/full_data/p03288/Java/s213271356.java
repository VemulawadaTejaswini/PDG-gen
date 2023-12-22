import java.util.*;
//https://atcoder.jp/contests/abc104/tasks/abc104_a

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int R = Integer.parseInt(sc.next());
        sc.close();

        if (R<=1200) {
            System.out.println("ABC");
        } else if (R<=2800) {
            System.out.println("ARC");
        } else {
            System.out.println("AGC");
        }
    }
}
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] c = new char[3][3];
        for (int i=0; i<3; i++) {
            c[i] = sc.next().toCharArray();
        }

        System.out.println(solve(c));
    }

    private static String solve(char[][] c) {
        return String.valueOf(c[0][0]) + String.valueOf(c[1][1]) + String.valueOf(c[2][2]);
    }
}

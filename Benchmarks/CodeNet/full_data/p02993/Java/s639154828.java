import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        char[] c = s.toCharArray();
        String ans = "Good";
        for (int i = 1; i < c.length; i++) {
            if (c[i] == c[i - 1]) {
                ans = "Bad";
            }
        }

        System.out.println(ans);
    }
}

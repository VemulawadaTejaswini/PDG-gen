import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] n = sc.next().split("");
        sc.close();

        String ans = "";

        for (int i = 0; i < 3; i++) {
            if (n[i].equals("1")) {
                ans += "9";
            } else {
                ans += "1";
            }
        }

        System.out.println(ans);

    }
}
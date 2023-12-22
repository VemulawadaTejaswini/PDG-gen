import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        in.close();
        int ans = 0;
        for (int i = 0; i < 4; i++) {
            if (str.charAt(i) == '+') {
                ans++;
            } else {
                ans--;
            }
        }
        System.out.println(ans);
    }
}
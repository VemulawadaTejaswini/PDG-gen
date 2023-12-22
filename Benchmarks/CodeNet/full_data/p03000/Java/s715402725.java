import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int bnd = in.nextInt();
        int lim = in.nextInt();
        int pos = 0;
        int ans = 0;

        for (int i = 0; i < bnd; i++) {
            pos += in.nextInt();
            if (lim < pos) {
                ans = i + 1;
                break;
            } else if (lim == pos) {
                ans = i + 2;
                break;
            }
        }
        System.out.println(ans);
    }
}

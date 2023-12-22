import java.util.*;

public class Main {

    public static List<List<Integer>> switchList;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int W = sc.nextInt();
        int H = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        sc.close();

        int judge = 0;
        int centerW = 0;
        int centerH = 0;
        if (W % 2 == 0) {
            centerW = W / 2;
        } else {
            centerW = W / 2 + 1;
        }

        if (H % 2 == 0) {
            centerH = H / 2;
        } else {
            centerH = H / 2 + 1;
        }

        if (centerH == x && centerW == y) {
            judge = 1;
        } else {
            judge = 0;
        }

        System.out.println(((double) W * (double) H) / 2 + " " + judge);
    }

}

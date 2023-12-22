import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int aYen = sc.nextInt();
        int bYen = sc.nextInt();
        int cYen = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();

        int cost = Integer.MAX_VALUE;
        for (int i = 0; i <= x; i++) {
            for (int j = 0; j <= y; j++) {
                int abCount = culcCost(i, j, x, y);
                int tmpCost = (aYen*i) + (bYen*j) + (cYen*abCount);

                if (tmpCost < cost) {
                    cost = tmpCost;
                }
            }
        }

        System.out.println(cost);
    }

    public static int culcCost(int aCount, int bCount, int targetACount, int targetBCount) {
        int abCount = 0;

        if (targetACount - aCount > 0) {
            int tmpABCount = (targetACount - aCount)*2;
            if (abCount < tmpABCount) abCount = tmpABCount;
        }

        if (targetBCount - bCount > 0) {
            int tmpABCount = (targetBCount - bCount)*2;
            if (abCount < tmpABCount) abCount = tmpABCount;
        }

        return abCount;
    }
}

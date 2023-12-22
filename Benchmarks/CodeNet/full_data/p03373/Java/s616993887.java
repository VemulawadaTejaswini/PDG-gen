import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int aYen = sc.nextInt();// ピザAの値段
        int bYen = sc.nextInt();// ピザBの値段
        int cYen = sc.nextInt();// ピザC(ABピザ)の値段
        int targetACnt = sc.nextInt();
        int targetBCnt = sc.nextInt();

        int aCnt = 0;
        int bCnt = 0;
        int cCnt = 0;
        int cost = Integer.MAX_VALUE;
        for (int i = 0; i <= targetACnt; i++) {
            for (int j = 0; j <= targetBCnt; j++) {
                int tmpACnt = i;
                int tmpBCnt = j;
                int tmpCCnt = targetACnt-tmpACnt>targetBCnt-tmpBCnt ? (targetACnt - tmpACnt)*2 : (targetBCnt - tmpBCnt)*2;

                int tmpCost = (aYen*tmpACnt) + (bYen*tmpBCnt) + (cYen*tmpCCnt);
                if (cost > tmpCost) {
                    cost = tmpCost;
                }
             }
        }

        System.out.println(cost);
    }
}

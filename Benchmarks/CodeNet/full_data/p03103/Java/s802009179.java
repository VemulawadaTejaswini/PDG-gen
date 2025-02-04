import java.util.*;


public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！

        Scanner sc = new Scanner(System.in);
        
        int shopCount = sc.nextInt();
        int needDrinkCount = sc.nextInt();
        
        long[] prices = new long[shopCount];
        int[] maxBuyCounts = new int[shopCount];
        for (int i = 0; i < shopCount; i++) {
            prices[i] = sc.nextLong();
            maxBuyCounts[i] = sc.nextInt();
        }
        
        for (int i = 1; i <= shopCount - 2; i++) {
            int count = 0;
            for (int j = shopCount - 1; j >= i; j--) {
                if (prices[j - 1] > prices[j]) {
                    long tmp = prices[j];
                    prices[j] = prices[j - 1];
                    prices[j - 1] = tmp;
                    int tmp2 = maxBuyCounts[j];
                    maxBuyCounts[j] = maxBuyCounts[j - 1];
                    maxBuyCounts[j - 1] = tmp2;
                }
            }
            
            count += maxBuyCounts[i - 1];
            if (count >= needDrinkCount) break;
        }
        
        long needMoney = 0;
        
        for (int i = 0; i < shopCount; i++) {
            if (maxBuyCounts[i] <= needDrinkCount) {
                needMoney += prices[i] * maxBuyCounts[i];
                needDrinkCount -= maxBuyCounts[i];
            } else {
                needMoney += prices[i] * needDrinkCount;
                needDrinkCount -= needDrinkCount;
            }
            
            if (needDrinkCount == 0) break;
        }
        
        System.out.println(needMoney);
    }
}
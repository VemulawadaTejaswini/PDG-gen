import java.util.*;

public class Main {
    public static void main(String[] a) {
        Scanner scan = new Scanner(System.in);
        int money = scan.nextInt();
        int[] prices = {100,101,102,103,104,105};
        if (money < 100) {
            System.out.println(0);
        } else {
            for (int i = 0; i < prices.length; i++) {
                int chkSole = money % prices[i];
                if (chkSole == 0) {
                    System.out.println(1);
                    return;
                }
            }
            
            int[] sumList = getSumList(prices);
            for (int i = 0; i < sumList.length; i++) {
                int chkBySum = money % sumList[i];
                if (chkBySum == 0) {
                    System.out.println(1);
                    return;
                }
            }
            System.out.println(0);
        }
    }
    
    public static int[] getSumList (int[] prices) {
        int[] sumList = new int[prices.length];
        int sum = 0;
        for (int i = 0; i < prices.length; i++) {
            for (int j = prices.length - 1; j >= 0; j--) {
                sum += prices[j];
            }
            sumList[i] = sum;
            prices[prices.length - 1] = 0;
        }
        return sumList;
    }
}
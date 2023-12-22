import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int value[] = new int[num];
        int cost[] = new int[num];
        int sumValue = 0;
        int sumCost = 0;

        for (int i = 0; i < num; i++) {
           value[i] = sc.nextInt(); 
        }
        for (int i = 0; i < num; i++) {
           cost[i] = sc.nextInt(); 
        }
        sc.close();
        for (int i = 0; i < num; i++) {
           if (value[i] - cost[i] > 0) {
               sumValue += value[i];
               sumCost += cost[i];
           }
        }
        System.out.println(sumValue - sumCost);
    }
}
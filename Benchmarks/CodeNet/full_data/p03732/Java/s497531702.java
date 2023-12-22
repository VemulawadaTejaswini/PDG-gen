
import java.util.Arrays;
import java.util.Scanner;

import static java.util.AbstractMap.SimpleEntry;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num,limit;
        num = sc.nextInt();
        limit = sc.nextInt();
        SimpleEntry<Integer,Integer>[] items = new SimpleEntry[num + 1];
        int[][] c = new int[num+1][limit + 1];
        for(int i = 1;i < num + 1;i++) {
            int value,wait;

            wait = sc.nextInt();
            value = sc.nextInt();
            items[i] = new SimpleEntry<>(value,wait);
        }
        Arrays.fill(c[0],0);
        for(int i = 0; i< c.length;i++)
            c[i][0] = 0;
        for(int i = 1;i <=num;i++)
            for(int w = 1;w<= limit;w++)
            {
                if(items[i].getValue() <= w) {
                    if (items[i].getKey() + c[i - 1][w - items[i].getValue()] > c[i - 1][w])
                        c[i][w] = items[i].getKey() + c[i - 1][w - items[i].getValue()];
                    else
                        c[i][w] = c[i - 1][w];
                }
                else
                    c[i][w] = c[i -1][w];
            }
        System.out.println(c[num][limit]);
    }
}

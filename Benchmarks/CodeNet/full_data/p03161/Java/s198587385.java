import javax.swing.*;
import java.io.*;
import java.util.*;

public class FightAgainstTraffic {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[count];
        int[] values = new int[count];
        for (int i = 0; i < count; i++) {
            arr[i] = sc.nextInt();
            values[i] = Integer.MAX_VALUE;
        }
        values[0] = 0;

        for (int i = 1; i < count; i++) {
            for (int j = 0; j < Math.min(k, i); j++) {
                values[i] = Math.min(values[i], values[i - 1 - j] + Math.abs(arr[i] - arr[i - 1 - j]));
            }
        }
        System.out.println(values[count - 1]);
    }
}
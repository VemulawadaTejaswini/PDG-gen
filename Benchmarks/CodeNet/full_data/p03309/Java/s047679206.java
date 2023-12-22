import java.util.*;

public class Main {
    static int MIN = Integer.MAX_VALUE;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        int[] array2 = new int[n];
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            array[i] = a;
            array2[i] = a - (i + 1);
        }
        int sum = 0;
        for(int num: array2) {
            sum += num;
        }
        int value = sum / n;
        int tempValue = 0;
        for(int i = 0; i < n; i++) {
            tempValue += Math.abs(array[i] - (value + (i + 1)));
        }
        MIN = Math.min(MIN, tempValue);
        tempValue = 0;
        value++;
        for(int i = 0; i < n; i++) {
            tempValue += Math.abs(array[i] - (value + (i + 1)));
        }
        MIN = Math.min(MIN, tempValue);
        tempValue = 0;
        value -= 2;
        for(int i = 0; i < n; i++) {
            tempValue += Math.abs(array[i] - (value + (i + 1)));
        }
        MIN = Math.min(MIN, tempValue);
        System.out.println(MIN);
    }
}
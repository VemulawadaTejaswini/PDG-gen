import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        int index = 0;
        int min = a[0] % 10;
        for (int i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
            if (min > a[i] % 10) {
                min = a[i] % 10;
                index = i;
            }
        }
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            if (i == index) continue;
            sum += get(a[i]);
        }
        sum+=a[index];
        System.out.println(sum);
    }

    private static int get(int a){
        if (a % 10 == 0) return a;
        return ((a / 10) + 1) * 10;
    }
}
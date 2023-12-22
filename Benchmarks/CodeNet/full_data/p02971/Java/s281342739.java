import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        int max1 = a[0];
        for (int i = 1; i < a.length; i++) {
            max1 = Math.max(max1, a[i]);
        }
        int max2 = max1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != max1) {
                max2 = a[i];
                break;
            }
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] == max1) {
                continue;
            }
            max2 = Math.max(max2, a[i]);
        }
        int maxNumber = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == max1) {
                maxNumber++;
            }
        }
        if (maxNumber == 1) {
            for (int i = 0; i < a.length; i++) {
                if (a[i] == max1) {
                    System.out.println(max2);
                } else {
                    System.out.println(max1);
                }
            }
        } else {
            for (int i = 0; i < a.length; i++) {
                System.out.println(max1);
            }
        }
        sc.close();
    }
}
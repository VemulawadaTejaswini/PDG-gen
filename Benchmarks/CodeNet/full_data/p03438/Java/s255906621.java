import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        long sumA = 0;
        for (int i = 0 ; i < n ; i++) {
            a[i] = sc.nextInt();
            sumA += (long) a[i];
        }
        long sumB = 0;
        for (int i = 0 ; i < n ; i++) {
            b[i] = sc.nextInt();
            sumB += (long) b[i];
        }
        sc.close();
        long dif = sumB - sumA;
        long count = 0;
        for (int i = 0 ; i < n ; i++) {
            if (a[i] > b[i]) {
                count += (long) (a[i] - b[i]);
            } else {
                if ((b[i] - a[i]) % 2 == 0) {
                    count += (long) (b[i] - a[i]) / 2;
                } else {
                    count += (long) (b[i] - a[i] + 1) / 2;
                }
            }
        }

        if (count <= dif) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }


    }

}
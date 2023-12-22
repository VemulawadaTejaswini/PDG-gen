import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();

        int[] a = new int[k];
        for (int i = 0; i < k; i++) {
            a[i] = sc.nextInt();
        }

        int prevRoundChildren = 2;
        for (int i = k - 2; i >= 0; i--) {
            if(a[i] > k) {
                System.out.println(-1); // ?
                return;
            }

            int m = smallestMultiply(a[i], prevRoundChildren);
            prevRoundChildren = a[i] * m;
        }

        int smallest = prevRoundChildren;
        int largest = smallest + a[0] - 1;
        System.out.println(smallest + " " + largest);
    }

    private static int smallestMultiply(int g, int v) {
        int m = 1;
        while (m * g < v) {
            m++;
        }
        return m;
    }

}
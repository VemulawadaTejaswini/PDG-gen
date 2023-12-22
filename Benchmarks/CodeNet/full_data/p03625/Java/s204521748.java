import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] an = new int[100000000+1];
        for (int i = 0; i < n; i++) {
            an[sc.nextInt()] += 1;
        }

        int x = 0;
        int y = 0;
        for (int i = 100000000; i > 0; i--) {
            if (an[i] >= 2 && i > y) {
                y = x;
                x = i;
            }
        }

        System.out.println(x*y);
    }

}
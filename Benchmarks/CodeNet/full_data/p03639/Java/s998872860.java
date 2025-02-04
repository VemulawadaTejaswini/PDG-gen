import java.util.Scanner;

public class Main {
    static long MOD = 109+7;

    static public void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        int countOdd = 0;
        int count2 = 0;
        int count4 = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            if(a[i] % 4 == 0) count4++;
            else if(a[i] % 2 == 0) count2++;
            else countOdd++;
        }

        if(count2 == 0) {
            if(count4 + 1 >= countOdd) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        } else {
            if(count4 >= countOdd) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
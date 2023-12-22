import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] an = new int[n];
        for (int i = 0; i < n; i++) {
            an[i] = sc.nextInt();
        }

        for (int i = n-1; i >= 0; i -= 2) {
            System.out.print(an[i] + " ");
        }
        for (int i = n%2; i < n; i += 2) {
            System.out.print(an[i] + " ");
        }
        System.out.println();
    }

}
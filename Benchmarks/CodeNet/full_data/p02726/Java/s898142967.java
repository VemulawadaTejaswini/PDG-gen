import java.util.Scanner;

public class D {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int x = scan.nextInt();
        int y = scan.nextInt();

        int[] t = new int[n];

        for (int i = 1; i < n+1; i++) {
            for (int j = i+1; j < n+1; j++) {
                t[Math.min(j-i,Math.abs(i-x) + Math.abs(j-y) + 1)]++;
            }
        }
        for (int i = 1; i < n; i++) {
            System.out.println(t[i]);
        }
    }
}

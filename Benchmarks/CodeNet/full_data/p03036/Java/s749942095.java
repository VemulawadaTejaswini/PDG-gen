import java.util.Scanner;

class Main {
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int r = scan.nextInt();
        int D = scan.nextInt();
        int x = scan.nextInt();

        int[] ans = new int[10];
        for (int i = 1; i < 11; i++) {
            ans[i - 1] = r * x - D;
            x = ans[i - 1];
        }
        for (int j = 0; j < ans.length; j++) {
            System.out.println(ans[j]);
        }
    }
}

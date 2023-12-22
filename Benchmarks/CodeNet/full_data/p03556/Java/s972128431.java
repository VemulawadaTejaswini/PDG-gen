import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(solve(n));
    }

    private static int solve(int n) {
        int i = 1;
        while (true) {
            int tmp = (i + 1) * (i + 1);
            if (tmp <= n) {
                i++;
            } else {
                break;
            }
        }
        return i * i;
    }
}
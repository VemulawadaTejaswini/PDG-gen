import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int N = cin.nextInt();
        int MOD = (int) Math.pow(10, 9) + 7;
        int power = 1;
        for (int i = 1; i <= N; i++) {
            power *= i;
            power %= MOD;
        }
        System.out.println(power);
    }
}
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] NK = sc.nextLine().split(" ");
        int N = Integer.parseInt(NK[0]);
        int K = Integer.parseInt(NK[1]);

        int pow = (int) Math.pow(K - 1, N - 1);
        System.out.println(K * pow);
    }
}

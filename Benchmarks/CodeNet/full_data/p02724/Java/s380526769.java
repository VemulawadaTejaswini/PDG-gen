import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int coin500 = (int)Math.floor(x/500.0);
        int coin5 = (int)Math.floor((x%500)/5.0);
        System.out.println(coin500*1000 + coin5*5);
    }
}

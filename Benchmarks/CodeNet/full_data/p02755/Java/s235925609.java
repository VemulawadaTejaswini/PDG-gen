import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int priceA = (int)(a / 0.08);
        int priceB = (int)(b / 0.1);

        if(priceA == priceB) {
            System.out.println(priceA + a);
        } else {
            System.out.println(-1);
        }
    }
}

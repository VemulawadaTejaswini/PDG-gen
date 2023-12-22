import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int aPrice = sc.nextInt();
        int bPrice = sc.nextInt();
        int abPrice = sc.nextInt();
        int minPrice = Math.min((aPrice + bPrice) / 2, abPrice);

        int aNeed = sc.nextInt();
        int bNeed = sc.nextInt();

        int total = Math.min(aNeed, bNeed) * 2 * minPrice;

        if (aNeed <= bNeed) {
            int remainNeed = bNeed - aNeed;
            total += remainNeed * Math.min(bPrice, abPrice * 2);
        } else {
            int remainNeed = aNeed - bNeed;
            total += remainNeed * Math.min(aPrice, abPrice * 2);
        }

        System.out.print(total);
    }
}

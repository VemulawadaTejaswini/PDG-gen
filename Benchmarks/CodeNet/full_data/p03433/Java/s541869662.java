import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int price = scanner.nextInt();
        int numberOf1Yen = scanner.nextInt();

        if(price % 500 == 0) {
            System.out.println("Yes");
        } else if (price % numberOf1Yen == 0) {
            System.out.println("Yes");
        } else {
            int left = price % 500;
            if(numberOf1Yen - left >= 0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
        System.out.println("No");
    }
}

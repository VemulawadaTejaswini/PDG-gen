import java.util.Scanner;

class GoldenCoins {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int money = Integer.parseInt(str);
        int sum = (money / 500) * 1000 + (money % 500) / 5 * 5;
        System.out.println(sum);    
    }
}
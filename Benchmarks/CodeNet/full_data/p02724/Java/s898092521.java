import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int money = scan.nextInt();
        int sum = (money / 500) * 1000 + (money % 500) / 5 * 5;
        System.out.println(sum);    
    }
}

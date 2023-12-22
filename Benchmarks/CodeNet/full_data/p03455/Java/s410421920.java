import java.util.Scanner;

class OddEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.print(a * b % 2 == 0 ? "Even" : "Odd");
    }
}
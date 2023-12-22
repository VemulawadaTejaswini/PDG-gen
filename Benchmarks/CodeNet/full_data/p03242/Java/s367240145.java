import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int n100 = 10 - (n / 100);
        int n10 = 10 - ((n - n100) / 10);
        int n1 = 10 - (n - n100 - n10);
        System.out.print(n100);
        System.out.print(n10);
        System.out.println(n1);
    }
}

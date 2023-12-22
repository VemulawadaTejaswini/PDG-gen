import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        long sum = 0;
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.close();
        for (int i = 1; i <= num; i++) {
            if (i % 3 != 0 && i % 5 != 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
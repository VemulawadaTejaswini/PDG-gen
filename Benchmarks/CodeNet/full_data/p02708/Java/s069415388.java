import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int count = 0;
        for (int i = k; i < n + 2; i++){
            int min = (i * (i - 1)) / 2;
            int max = (n * i) + i - ((i * (i + 1)) / 2);
            count += max - min + 1;
        }
        System.out.println((int) (count % (Math.pow(10, 9) + 7)));
    }
}

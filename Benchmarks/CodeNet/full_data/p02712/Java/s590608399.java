import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        boolean hasNextInt = scanner.hasNextInt();
//        int x = scanner.nextInt();
//        if(hasNextInt) {
//            while(x > 0) {
//                if(x % 10 == 7) {
//                    System.out.println("Yes");
//                    break;
//                } else {
//                    x /= 10;
//                }
//                if(x == 0) {
//                    System.out.println("No");
//                }
//            }
//        }
//        scanner.close();

        Scanner scanner = new Scanner(System.in);
        boolean hasNextInt = scanner.hasNextInt();
        int n = scanner.nextInt();
        long sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 3 != 0 && i % 5 != 0) {
                sum += i;
            } if(i == n) {
                System.out.println(sum);
                break;
            }
        }
        scanner.close();
    }
}
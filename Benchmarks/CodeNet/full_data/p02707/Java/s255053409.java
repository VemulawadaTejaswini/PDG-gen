import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextInt();
        long c = -1;
        long cV = 0;
        long curr,temp1;
        scanner.nextLine();
        for (int i = 0; i < n-1; i++) {
            curr = scanner.nextLong();
            if (curr == c) {
                cV++;
            } else {
                if (c == -1) {
                    c = curr;
                    cV++;
                } else {
                    System.out.println(cV);
                    if (curr - c != 1) {
                        temp1 = curr - c;
                        for (int j = 0; j < temp1; j++) {
                            System.out.println(0);
                        }
                    }
                    c = curr;
                    cV = 1;
                }
            }
        }
        System.out.println(cV);
        long time = n - c;
        if (time <= 1) {
            System.out.println(0);
        } else {
            for (int i = 0; i < time; i++) {
                System.out.println(0);
            }
        }
    }

}
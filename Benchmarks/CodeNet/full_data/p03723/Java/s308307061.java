import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) throws Exception {
        try (
            Scanner sc = new Scanner(System.in);
        ) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            if (a == b && b == c) {
                System.out.println(-1);
            } else {
                int count = 0;
                while (a % 2 == 0 && b % 2 == 0 && c % 2 == 0) {
                    count += 1;
                    int newA = (b / 2) + (c / 2);
                    int newB = (c / 2) + (a / 2);
                    int newC = (a / 2) + (b / 2);
                    a = newA;
                    b = newB;
                    c = newC;
                }
                System.out.println(count);
            }
        }
    }

}

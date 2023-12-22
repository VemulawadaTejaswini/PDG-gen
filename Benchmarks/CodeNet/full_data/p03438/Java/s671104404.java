import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int add_a = 0;
        int add_b = 0;

        for (int i = 0; i < n; i++) {
            add_a += sc.nextInt();
        }

        for (int j = 0; j < n; j++) {
            add_b += sc.nextInt();
        }

        sc.close();

        if (add_a % 2 == 0 && add_b % 2 == 1 || add_a % 2 == 1 && add_b % 2 == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
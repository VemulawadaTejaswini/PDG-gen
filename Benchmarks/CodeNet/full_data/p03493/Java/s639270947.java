import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            int a = sc.nextInt();
            if (a == 1) {
                sum++;
            }
        }
        System.out.println(sum);
    }
}

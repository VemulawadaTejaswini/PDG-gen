import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int num = 0;
        if (k % 2 == 0) {
            num = (int) Math.pow(k / 2, 2);
        } else {
            num = (k / 2) * (k / 2 + 1);
        }
        System.out.println(num);
    }
}
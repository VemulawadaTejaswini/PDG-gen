import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = 0;
        int num = 1;
        for (int i = 1 ; i <= n ; i++) {
            int x = i;
            int count = 0;
            while (x % 2 == 0) {
                count++;
                x /= 2;
            }
            if (count > max) {
                num = i;
                max = count;
            }
        }
        System.out.println(num);
    }

}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int count = 0;
        for (int i = a; i <= b; i++) {
            String s = String.valueOf(i);
            if (new StringBuilder(s).reverse().toString().equals(s)) {
                count++;
            }
        }

        System.out.println(count);
    }
}

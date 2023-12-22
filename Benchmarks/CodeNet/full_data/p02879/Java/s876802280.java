import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int a = sc.nextInt();

        int b = sc.nextInt();

        if ((1 <= a && a <= 9) && (1 <= b && b <= 9)) {
            System.out.println(a * b);
        } else {
            System.out.println("-1");
        }



    }
}


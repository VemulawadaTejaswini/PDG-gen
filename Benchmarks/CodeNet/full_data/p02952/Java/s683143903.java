import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum = 0;
        if (a - 10 >= 0) {
            sum += 9;
            if (a - 10 >= 0 && a - 99 <= 0) {
                System.out.println(sum);
            }
        } else if (10 - a > 0) {
            System.out.println(a);
        }
        if (a - 1000 >= 0) {
            sum += 900;
            if (a - 1000 >= 0 && a - 9999 <= 0) {
                System.out.println(sum);
            }
        } else if (a - 100 >= 0) {
            System.out.println(9 + a - 99);
        }
        if (a - 100000 >= 0) {
            sum = 90909;
            System.out.println(sum);
        } else if (a - 10000 >= 0) {
            System.out.println(9 + 900 + a - 9999);
        }
    }
}

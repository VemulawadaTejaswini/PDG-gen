import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int total = 0;
        int count = 0;
        while (count<2) {
            if (a > b) {
                total += a;
                a--;
                count++;
            } else if (a < b) {
                total += b;
                b--;
                count++;
            } else if (a == b) {
                total += a;
                a--;
                count++;
            }
        }
        System.out.println(total);
    }

}
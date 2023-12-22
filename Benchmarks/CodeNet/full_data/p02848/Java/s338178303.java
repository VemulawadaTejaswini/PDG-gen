import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        String str = scan.next();
        String sub1 = str.substring(0, num - 1);
        String sub2 = str.substring(num, str.length());

        System.out.println(sub2 + sub1);
    }
}
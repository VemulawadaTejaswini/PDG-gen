import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // 行入力
        scan.next();
        String strLine = scan.next();
        scan.next();
        scan.close();
        String[] str = strLine.split("", 0);

        System.out.println("A" + str[0] + "C");


    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        String strLine = scan.next();
        str = scan.next();
        scan.close();
        String[] strlist = strLine.split("", 0);

        System.out.println("A" + strlist[0] + "C");

    }
}

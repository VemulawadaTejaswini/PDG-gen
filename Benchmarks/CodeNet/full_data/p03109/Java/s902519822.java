import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        String[] s = str.split("/");
        System.out.println(Integer.parseInt(s[1])<=4?"Heisei":"TBD");
    }
}

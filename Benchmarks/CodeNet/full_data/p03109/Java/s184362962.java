import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String S = sc.next();

        String ymd = S.replace("/","");
        int ymdi = Integer.parseInt(ymd);
        if (ymdi <= 20190430) {
            System.out.println("Heisei");
        }
        else {
            System.out.println("TBD");
        }

    }
}
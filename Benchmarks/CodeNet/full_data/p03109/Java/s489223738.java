import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        String s = std.next();
        String[] texts = s.split("/");
        String monthS = texts[1];
        String dayS = texts[2];
        int month = Integer.parseInt(monthS);
        int day = Integer.parseInt(dayS);
        if (month <= 4 && day <= 30) {
            System.out.println("Heisei");
        } else {
            System.out.println("TBD");
        }
    }
}

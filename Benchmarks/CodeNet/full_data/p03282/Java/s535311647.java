
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        long gosencho = (long) (Math.pow(10, 12) * 5);

        String s = sc.next();
        long k = sc.nextLong();
        int index = Integer.parseInt(String.valueOf(s.charAt(0)));

        if (index == 1 && k != 1) {
            System.out.println(s.charAt(1));
        } else {
            System.out.println(index);
        }

    }
}

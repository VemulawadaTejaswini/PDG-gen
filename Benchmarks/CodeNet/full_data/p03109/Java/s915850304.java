import java.util.Scanner;

public class Main {

    static void main(String[] args) {

        String k = "2019/04/30";
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        if (s.contains("2019")) {
            if (s.equals(k)) {
                System.out.println("Heisei");
            } else {
                System.out.println("TBD");
            }
        }
    }
}

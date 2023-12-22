import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        String s = sc.nextLine();
        int result = s.indexOf("Y");
        if (result != -1) {
            System.out.println("Four");
        } else {
            System.out.println("Three");
        }
    }
}

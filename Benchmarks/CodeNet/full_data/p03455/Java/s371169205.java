
import java.util.Scanner;


public class Main {
    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        String a = sc.next();
        String b = sc.next();
        int num = Integer.parseInt(a + b);
        String answer = String.valueOf(Math.sqrt(num));
        if (answer.trim().endsWith(".0")) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        java.io.PrintStream out = System.out;
        int a = scan.nextInt();
        String s = scan.next();
        if (a >= 3200) {
            out.println(s);
        } else {
            out.println("red");
        }
    }
}

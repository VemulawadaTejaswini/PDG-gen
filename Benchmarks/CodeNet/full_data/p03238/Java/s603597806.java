import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        if (a == 1) {
            System.out.println("Hello World");
        } else {
            System.out.println(in.nextInt() + in.nextInt());
        }
    }
}
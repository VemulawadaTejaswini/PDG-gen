import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println((s.nextInt()+s.nextInt()) % 2 == 0 ? "Even" : "Odd");
    }
}
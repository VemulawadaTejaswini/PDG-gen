import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();
        if (a.equals("A"))
            System.out.println("T");
        if (a.equals("T"))
            System.out.println("A");
        if (a.equals("C"))
            System.out.println("G");
        if (a.equals("G"))
            System.out.println("C");
    }
}
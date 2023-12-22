import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Integer[] choices = { 1, 2, 3 };
        Scanner sc = new Scanner(System.in);

        System.out.print("A:");
        Integer A = sc.nextInt();

        System.out.print("B:");
        Integer B = sc.nextInt();

        for (Integer choice : choices) {
            if (choice != A && choice != B) {
                System.out.println(choice);
                break;
            }
        }

        sc.close();

    }

}
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] array = input.split(" ");

        int a = Integer.parseInt(array[0]) * Integer.parseInt(array[1]);
        int b = Integer.parseInt(array[2]) * Integer.parseInt(array[3]);

        if (a > b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }
}

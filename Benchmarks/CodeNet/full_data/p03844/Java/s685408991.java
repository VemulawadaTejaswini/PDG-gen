import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] array = input.split(" ");
        int num1 = Integer.parseInt(array[0]);
        int num2 = Integer.parseInt(array[2]);

        if(array[1].equals("+")) {
            System.out.println(num1+num2);
        } else if(array[1].equals("-")) {
            System.out.println(num1-num2);
        }
    }
}

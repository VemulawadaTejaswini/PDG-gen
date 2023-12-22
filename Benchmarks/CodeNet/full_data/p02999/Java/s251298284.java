import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            String[] inputs = input.split(" ");

            int x = Integer.parseInt(inputs[0]);
            int a = Integer.parseInt(inputs[1]);

            if (x < a) {
                System.out.println(0);
            } else {
                System.out.println(10);
            }


            
            scanner.close();
    }
}
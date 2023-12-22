import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextLine()) {
            String[] array = scanner.nextLine().split(" ");
            int a = Integer.parseInt(array[0]);
            int b = Integer.parseInt(array[1]);

            if (a <= 5) {
                System.out.println(0);
            } else if (a <= 12) {
                System.out.println(b / 2);
            } else {
                System.out.println(b);
            }
        }
    }
}
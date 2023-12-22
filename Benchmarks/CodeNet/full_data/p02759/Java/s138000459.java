import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputInt = scanner.nextInt();
        int oneMore = inputInt % 2;
        System.out.println(inputInt / 2 + oneMore);
    }
}

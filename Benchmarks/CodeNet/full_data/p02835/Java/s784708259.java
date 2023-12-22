import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a1 = scanner.nextInt();
        int a2 = scanner.nextInt();
        int a3 = scanner.nextInt();

        if (a1+a2+a3 >= 22){
            System.out.println("bust");
        }
        else {
            System.out.println("win");
        }
    }
}

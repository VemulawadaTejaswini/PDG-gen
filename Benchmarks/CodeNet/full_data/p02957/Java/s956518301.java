import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer a = scanner.nextInt();
        Integer b = scanner.nextInt();
        int sum = a + b;
        if(sum % 2 != 0) {
          System.out.println("IMPOSSIBLE");
        } else {
          System.out.println(sum / 2);
        }
    }
}
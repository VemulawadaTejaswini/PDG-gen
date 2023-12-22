import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int result = x - y + 1;
       
            System.out.println(result);
            scanner.close();
          } catch (InputMismatchException e) { 
            System.out.println("整数を入力してください。");
          }
    }
}

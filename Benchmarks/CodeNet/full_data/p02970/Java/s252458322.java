
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer n = scanner.nextInt();
        Integer d = scanner.nextInt();
        
        int result = 1;
        while(true) {
          if(result * (2 * d +1) >= n) {
            System.out.println(result);
            return;
          }
          result++;
        }
    }
    
}

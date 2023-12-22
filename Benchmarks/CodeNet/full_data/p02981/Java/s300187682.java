import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer n = scanner.nextInt();
        Integer a = scanner.nextInt();
        Integer b = scanner.nextInt();
        
        Integer kingaku = n*a;
        if(kingaku <= b) {
          System.out.println(kingaku);
          return;
        } else {
          System.out.println(b);
          return;
        }
        
        
    }
}
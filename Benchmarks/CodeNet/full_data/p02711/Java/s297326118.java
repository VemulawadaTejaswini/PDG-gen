
import java.util.Scanner;

public class Main {
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final String s = scanner.next();
        if(s.contains("7")){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}

import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String N = input.next();
        if (N.contains("7")) {
          System.out.println("Yes");
        } else {
          System.out.println("No");
        }
    }
}
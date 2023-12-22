import java.util.*;

public class Main {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       String input = scanner.next();
       String output = input.substring(0, 4) + " " + input.substring(4);
       System.out.print(output);
    }
}
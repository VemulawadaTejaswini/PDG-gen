import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        String result = "Odd";

        if((a * b) % 2 == 0){
            result = "Even";
        }

        System.out.println(result);
    }
}
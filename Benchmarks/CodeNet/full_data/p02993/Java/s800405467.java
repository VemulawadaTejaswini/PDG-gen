import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        String last = "";
        boolean isBad = false;
        for (int i = 0; i < input.length(); i++) {
            String newStr = input.substring(i, i + 1);
            if (last.equals(newStr)) {
                System.out.println("Bad");
                isBad = true;
                break;
            }
            last = newStr;
        }
        if (!isBad) {
            System.out.println("Good");
        }
    }
}
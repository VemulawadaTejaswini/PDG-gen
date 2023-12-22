import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        check(line);
    }

    public static void check(String line) {
        Map<String, String> result = new HashMap<String, String>();
        for (int i = 0; i < line.length(); i++) {
            result.put(line.substring(i, i + 1), "");
        }
        if (result.size() == 2) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
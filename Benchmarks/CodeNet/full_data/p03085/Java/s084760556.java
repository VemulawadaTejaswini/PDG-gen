import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static Map<Character, Character> table = new HashMap<Character, Character>() {{
        put('A', 'T');
        put('T', 'A');
        put('G', 'C');
        put('C', 'G');
    }};
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        if(input.length() == 1)
            System.out.println(table.get(input.charAt(0)));
    }
}
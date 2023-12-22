import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    static Map<String, Integer> m = new HashMap<>();
    static {
        m.put("SUN", 7);
        m.put("MON", 6);
        m.put("TUE", 5);
        m.put("WED", 4);
        m.put("THU", 3);
        m.put("FRI", 2);
        m.put("SAT", 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.println(m.get(s));
    }
}

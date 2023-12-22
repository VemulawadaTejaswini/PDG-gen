import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Map<String, Integer> map = new HashMap<String, Integer>() {{
            put("SUN", 7);
            put("MON", 6);
            put("TUE", 5);
            put("WED", 4);
            put("THU", 3);
            put("FRI", 2);
            put("SAT", 1);
        }};
        String s = in.next();
        System.out.println(map.get(s));
    }
}

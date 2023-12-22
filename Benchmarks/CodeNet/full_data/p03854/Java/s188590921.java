import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String S = scanner.next();

        if (search(S)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    static Map<String, Boolean> cache = new HashMap<>();

    static boolean search(String s) {
        if (s.isEmpty()) {
            return true;
        }
        boolean found = false;
        if (s.startsWith("dream")) {
            String sub = s.substring("dream".length());
            if (cache.containsKey(sub)) {
                found = cache.get(sub);
            } else {
                found = search(sub);
                cache.put(sub, found);
            }
        }
        if (!found && s.startsWith("dreamer")) {
            String sub = s.substring("dreamer".length());
            if (cache.containsKey(sub)) {
                found = cache.get(sub);
            } else {
                found = search(sub);
                cache.put(sub, found);
            }
        }
        if (!found && s.startsWith("eraser")) {
            String sub = s.substring("eraser".length());
            if (cache.containsKey(sub)) {
                found = cache.get(sub);
            } else {
                found = search(sub);
                cache.put(sub, found);
            }
        }
        if (!found && s.startsWith("erase")) {
            String sub = s.substring("erase".length());
            if (cache.containsKey(sub)) {
                found = cache.get(sub);
            } else {
                found = search(sub);
                cache.put(sub, found);
            }
        }
        cache.put(s, found);
        return found;
    }
}

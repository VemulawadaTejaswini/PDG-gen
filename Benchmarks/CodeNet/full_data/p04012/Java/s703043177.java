import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String w = sc.next();
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < w.length(); i++) {
            String key = String.valueOf(w.charAt(i));

            if (map.containsKey(key)) {
                map.put(key, map.get(key)+1);
            } else {
                map.put(key, 1);
            }
        }

        boolean isBeauty = true;
        for (HashMap.Entry entry: map.entrySet()) {
            if ((Integer) entry.getValue() % 2 != 0) {
                isBeauty = false;
                break;
            }
        }

        System.out.println(isBeauty ? "Yes" : "No");
    }
}

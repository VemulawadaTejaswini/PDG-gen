

import java.util.*;

/**
 * Created by thompson on 08/09/2018.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        List<String> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            list.add(sc.next());
        }

        Set<String> set = new HashSet<>();
        boolean result = true;
        set.add(list.get(0));

        for (int i = 1; i < list.size(); i++) {
            String last = list.get(i - 1);
            String current = list.get(i);

            if (set.contains(current)) {
                result = false;
                break;
            }

            if (current.charAt(0) != last.charAt(last.length() - 1)){
                result = false;
                break;
            }

            set.add(current);
        }

        if (result)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Integer, Integer> h = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            h.put(sc.nextInt(), i);
        }

        List<String> result = new ArrayList<>();
        for (int i = 1; i <= n; i++){
            result.add(Integer.toString(h.get(i)));
        }

        System.out.println(String.join(" ", result));
    }
}

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        List<String> list = new ArrayList<>();

        for (int i=0; i<num; i++) {
            char[] str = sc.next().toCharArray();
            Arrays.sort(str);
            list.add(String.valueOf(str));
        }

        int count = 0;
        Map<String, Integer> map = new HashMap<>();

        for (int i=0; i<num; i++) {
            String input = list.get(i);

            if (map.containsKey(input)) {
                count += map.get(input);
                map.put(input, map.get(input) + 1);
            } else {
                map.put(input, 1);
            }
        }

        System.out.println(count);
    }
}

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int k = sc.nextInt();
        Set<String> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            int offset = i + 1;
            for (int j = offset; j < Math.min(s.length() + 1, offset + k + 1); j++) {
                set.add(s.substring(i, j));
            }
        }
        List<String> list = new ArrayList<>(set);
        Collections.sort(list);
        System.out.println(list.get(k - 1));
        sc.close();
    }
}
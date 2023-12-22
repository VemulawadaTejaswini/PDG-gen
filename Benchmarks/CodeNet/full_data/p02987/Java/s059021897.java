import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    //Fifty-Fifty
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if (sln(s)) System.out.println("Yes");
        else System.out.println("No");
        sc.close();
    }

    static boolean sln(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) map.put(c, map.getOrDefault(c, 0) + 1);
        if (map.size() != 2) return false;
        for (char c : map.keySet()) {
            if (map.get(c) != 2) return false;
        }
        return true;
    }
}

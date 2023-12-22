import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        Set<Character> set = new HashSet<>();
        char[] rgb = {'R', 'G', 'B'};
        int counter = 0;
        for (int i = 0; i < n - 1; i++) {
            char first = s.charAt(i);
            set.add(first);
            int j = i + 1;
            while (j < n - 1) {
                while (first == s.charAt(j) && j < n - 2) {
                    j++;
                }
                char second = s.charAt(j);
                set.add(second);
                char third = 0;
                for (int j2 = 0; j2 < rgb.length; j2++) {
                    if (!set.contains(rgb[j2])) {
                        third = rgb[j2];
                        break;
                    }
                }
                String part = s.substring(j + 1);
                for (int k = 0; k < part.length(); k++) {
                    if (part.charAt(k) == third) {
                        counter++;
                    }
                }
                if (2 * j - i < n) {
                    if (s.charAt(2 * j - i) == third) {
                        counter--;
                    }
                }
                j++;
                set.remove(second);
            }
            set.clear();
        }
        System.out.println(counter);
        sc.close();
    }
}
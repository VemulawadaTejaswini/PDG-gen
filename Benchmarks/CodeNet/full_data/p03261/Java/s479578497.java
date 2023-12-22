import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<String> words = new ArrayList<>();
        for (int i = 0; i < n; i++) words.add(sc.next());

        Set<String> removed = new LinkedHashSet<>(words);
        if (words.size() != removed.size()) {
            System.out.println("No");
            return;
        }

        char end = words.get(0).charAt(words.get(0).length() - 1);
        for (int i = 1; i < n; i++) {
            char start = words.get(i).charAt(0);
            if (start != end) {
                System.out.println("No");
                return;
            }
            end = words.get(i).charAt(words.get(i).length() - 1);
        }
        System.out.println("Yes");
    }
}
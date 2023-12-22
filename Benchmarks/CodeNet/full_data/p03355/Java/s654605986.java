import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    private static char[] ignoreCase = {'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int K = scanner.nextInt();

        List<String> strings = new ArrayList<>();

        Top:
        for (int i = 0; i < s.length(); i++) {
            for (char c : ignoreCase) {
                if (s.charAt(i) == c) {
                    continue Top;
                }
            }

            String sub = String.valueOf(s.charAt(i));
            if (!strings.contains(sub)) {
                strings.add(sub);
            }

            if (i == s.length() - 1) { // last
                break;
            }

            for (int j = i + 1; j < s.length(); j++) {
                sub += String.valueOf(s.charAt(j));
                if (!strings.contains(sub)) {
                    strings.add(sub);
                }
            }
        }

        // sort
        for (int i = 0; i < strings.size() - 1; i++) {
            for (int j = strings.size() - 1; j > i; j--) {
                String after = strings.get(j);
                String before = strings.get(j - 1);
                if (before.compareTo(after) > 0) {
                    strings.set(j - 1, after);
                    strings.set(j, before);
                }
            }
        }

        System.out.print(strings.get(K - 1));
    }
}

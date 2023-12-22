import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int K = scanner.nextInt();
        List<String> strings = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
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

        String temp;
        for (int i = 0; i < strings.size() - 1; i++) {
            for (int j = strings.size() - 1; j > i; j--) {
                String after = strings.get(j);
                String before = strings.get(j - 1);
                if (before.compareTo(after) > 0) {
                    temp = before;
                    strings.set(j - 1, after);
                    strings.set(j, temp);
                }
            }
        }

        System.out.print(strings.get(K-1));
    }
}

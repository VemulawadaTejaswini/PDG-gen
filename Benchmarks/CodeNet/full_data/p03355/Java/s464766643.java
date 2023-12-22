
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String args[]) {
        InputParser parser = new InputParser(System.in);

        final String s = parser.scanLineNTimes(1).get(0);
        final Integer K = Integer.parseInt(parser.scanLineNTimes(1).get(0));

        List<String> subs = getSubstrings(s).stream()
                .distinct()
                .sorted()
                .collect(Collectors.toList());

        System.out.println(subs.get(K - 1));


    }

    public static List<String> getSubstrings(String s) {
        List<String> substrings = new ArrayList<>();
        for(int i = 0; i < s.length(); i++) {
            for(int j = i; j < s.length(); j++) {
                String sub = s.substring(i, j + 1);
                substrings.add(sub);
            }
        }

        return substrings;
    }

    static class InputParser {
        private static Scanner scanner;

        public InputParser(InputStream in) {
            scanner = new Scanner(in);
        }

        public List<String> scanLineNTimes(int n) {
            List<String> lines = new ArrayList<String>();
            for (int i = 0; i < n; i++) {
                lines.add(scanner.nextLine());
            }
            return lines;
        }
    }
}
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sn = new Scanner(System.in);
        Input input = InputParser.perse(sn, 2);
        sn.close();

        Integer n = input.getInt(1, 1);
        List<Integer> p = input.getIntLine(2);

        int min = 200000;
        int count = 0;
        for(Integer e : p) {
            if (e <= min) {
                count++;
                min = e;
            }
        }
        System.out.println(count);
    }

    private static class InputParser {
        static Input perse(Scanner sn, int line) {
            Input result = new Input();
            while (line-- > 0) {
                String[] args = sn.nextLine().split(" ");
                result.addAll(args);
            }
            return result;
        }
    }

    private static class Input {
        private Map<Integer, Map<Integer, String>> inputs;
        private int now = 1;
        private int innerNext = 1;

        Input() {
            inputs = new HashMap<>();
            inputs.put(now, new HashMap<>());
        }

        void addAll(String[] args) {
            for (String str : args) {
                add(str);
            }
            next();
        }

        void add(String str) {
            inputs.get(now).put(innerNext++, str);
        }

        void next() {
            inputs.put(++now, new HashMap<>());
            innerNext = 1;
        }

        String getString(int i, int j) {
            return inputs.get(i).get(j);
        }

        int getInt(int i, int j) {
            return Integer.parseInt(getString(i, j));
        }

        double getDouble(int i, int j) {
            return Double.parseDouble(getString(i, j));
        }

        List<Integer> getIntLine(int i) {
            Map<Integer, String> m = inputs.get(i);
            Integer[] l = new Integer[m.size()];
            m.entrySet().stream().forEach(e -> {
                l[e.getKey() - 1] = Integer.parseInt(e.getValue());
            });
            return Arrays.asList(l);
        }

        List<Integer> getIntVerticalLine(int line, int start, int size) {
            List<Integer> list = new ArrayList<>();
            for(int i = start; i < start + size; i++) {
                list.add(getInt(i, line));
            }
            return list;
        }
    }
}

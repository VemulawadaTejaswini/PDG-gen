import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        sc.close();

        // 主処理
        List<String> list = new ArrayList<>();
        list.add("3");
        list.add("5");
        list.add("7");
        for (int i = 0; i < 8; i++) {
            int size = list.size();
            for (int j = 0; j < size; j++) {
                String base = list.get(j);
                list.add(base + 3);
                list.add(base + 5);
                list.add(base + 7);
            }
        }

        List<Long> longList = list.stream().filter(i -> i.contains("3") && i.contains("5") && i.contains("7"))
                .map(i -> Long.parseLong(i)).collect(Collectors.toList());
        longList = new ArrayList<>(new HashSet<>(longList));
        Collections.sort(longList);

        int result = 0;
        for (int i = 0; i < longList.size(); i++) {
            if (longList.get(i) <= (long) n) {
                result++;
            }
        }

        // 出力
        System.out.println(result);
    }
}

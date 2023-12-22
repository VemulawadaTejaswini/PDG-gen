import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.next());
        int M = Integer.parseInt(scanner.next());

        // 県ごとに年を持つ
        LinkedHashMap<Integer, List<Integer>> prefectureMap = new LinkedHashMap<>();
        for (int i = 0; i < M; i++) {
            int prefectureId = Integer.parseInt(scanner.next());
            int year = Integer.parseInt(scanner.next());

            List<Integer> list = prefectureMap.get(prefectureId);
            if (list == null) {
                list = new ArrayList<>();
            }
            list.add(year);

            prefectureMap.put(prefectureId, list);
        }

        prefectureMap.forEach((key, value) -> {
            Collections.sort(value); // 昇順

            for (int i = 1; i <= value.size(); i++) {
                System.out.println(String.format("%06d%06d", key, i));
            }
        });

        scanner.close();
    }
}

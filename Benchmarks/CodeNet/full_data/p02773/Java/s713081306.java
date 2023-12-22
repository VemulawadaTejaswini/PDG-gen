import java.util.*;
import java.util.Map.Entry;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Map<String, Integer> vote_list = new HashMap<String, Integer>(N);
        int max_value = 1;
        for (int i = 0; i < N; i++) {
            String name = sc.next();
            if (vote_list.containsKey(name)) {
                int count = vote_list.get(name) + 1;
                vote_list.put(name, count);
                if (max_value < count) {
                    max_value = count;
                }
            } else {
                vote_list.put(name, 1);
            }
        }
        sc.close();

        List<Entry<String, Integer>> list_entries = new ArrayList<Entry<String, Integer>>(vote_list.entrySet());
        Collections.sort(list_entries, new Comparator<Entry<String, Integer>>() {
            public int compare(Entry<String, Integer> a, Entry<String, Integer> b) {
                if (a.getValue().intValue() == b.getValue().intValue()) {
                    return a.getKey().compareTo(b.getKey());
                } else {
                    return a.getValue().compareTo(b.getValue());
                }
            }
        });
        for (Entry<String, Integer> entry : list_entries) {
            if (entry.getValue() == max_value) {
                System.out.printf("%s\n", entry.getKey());
            }
            else {
                break;
            }
        }
    }
}
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String s = scanner.nextLine();
            if(hashMap.containsKey(s)){
                hashMap.put(s, hashMap.get(s)+1);
            }else{
                hashMap.put(s,1);
            }
        }
        Integer maxCount = hashMap.values().stream().max(Integer::compareTo).get();
        hashMap.entrySet().stream().filter(entry->entry.getValue().equals(maxCount))
                .map(Map.Entry::getKey).sorted()
                .forEach(System.out::println);
    }
}
